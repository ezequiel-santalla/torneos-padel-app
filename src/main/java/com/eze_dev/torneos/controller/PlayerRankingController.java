package com.eze_dev.torneos.controller;

import com.eze_dev.torneos.dto.response.PlayerRankingResponseDto;
import com.eze_dev.torneos.service.interfaces.IPlayerStandingService;
import com.eze_dev.torneos.types.CategoryType;
import com.eze_dev.torneos.types.GenderType;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/player-rankings")
@RequiredArgsConstructor
public class PlayerRankingController {

    private final IPlayerStandingService playerStandingService;

    @GetMapping
    public ResponseEntity<List<PlayerRankingResponseDto>> getPlayerRankingsPaginated(
            @RequestParam(required = false) CategoryType category,
            @RequestParam(required = false) GenderType gender) {

        return ResponseEntity.ok(playerStandingService.getPlayerRankings(category, gender));
    }
}
