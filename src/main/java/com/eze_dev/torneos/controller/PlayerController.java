package com.eze_dev.torneos.controller;

import com.eze_dev.torneos.dto.create.PlayerCreateDto;
import com.eze_dev.torneos.dto.response.PaginatedResponseDto;
import com.eze_dev.torneos.dto.response.PlayerResponseDto;
import com.eze_dev.torneos.dto.update.PlayerUpdateDto;
import com.eze_dev.torneos.service.interfaces.IPlayerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/players")
@RequiredArgsConstructor
public class PlayerController {

    private final IPlayerService playerService;

    @PostMapping
    public ResponseEntity<PlayerResponseDto> createPlayer(@Valid @RequestBody PlayerCreateDto playerCreateDto) {
        return ResponseEntity.ok(playerService.create(playerCreateDto));
    }

    @GetMapping
    public ResponseEntity<PaginatedResponseDto<PlayerResponseDto>> getAllPlayersPaginated(@PageableDefault Pageable pageable) {
        return ResponseEntity.ok(playerService.getAllPaginated(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlayerResponseDto> getPlayerById(@PathVariable UUID id) {
        return ResponseEntity.ok(playerService.getById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PlayerResponseDto> updatePlayer(@PathVariable UUID id, @Valid @RequestBody PlayerUpdateDto playerUpdateDto) {
        return ResponseEntity.ok(playerService.update(id, playerUpdateDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlayer(@PathVariable UUID id) {
        playerService.delete(id);

        return ResponseEntity.noContent().build();
    }
}
