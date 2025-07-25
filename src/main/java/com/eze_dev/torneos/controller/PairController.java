package com.eze_dev.torneos.controller;

import com.eze_dev.torneos.dto.create.PairCreateDto;
import com.eze_dev.torneos.dto.response.PairResponseDto;
import com.eze_dev.torneos.dto.update.PairUpdateDto;
import com.eze_dev.torneos.service.interfaces.IPairService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/tournaments/pairs")
@RequiredArgsConstructor
public class PairController {

    private final IPairService pairService;

    @PostMapping
    public ResponseEntity<PairResponseDto> createPair(@Valid @RequestBody PairCreateDto pairCreateDto) {
        return ResponseEntity.ok(pairService.create(pairCreateDto));
    }

    @GetMapping
    public ResponseEntity<List<PairResponseDto>> getAllPairs() {
        return ResponseEntity.ok(pairService.getAll());
    }


    @GetMapping("/{id}")
    public ResponseEntity<PairResponseDto> getPairById(@PathVariable UUID id) {
        return ResponseEntity.ok(pairService.getById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PairResponseDto> updatePair(@PathVariable UUID id, @RequestBody @Valid PairUpdateDto dto) {
        return ResponseEntity.ok(pairService.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePair(@PathVariable UUID id) {
        pairService.delete(id);

        return ResponseEntity.noContent().build();
    }
}

