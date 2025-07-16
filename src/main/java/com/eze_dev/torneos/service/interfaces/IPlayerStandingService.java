package com.eze_dev.torneos.service.interfaces;

import com.eze_dev.torneos.dto.response.PlayerRankingResponseDto;
import com.eze_dev.torneos.dto.response.PlayerStandingResponseDto;
import com.eze_dev.torneos.types.CategoryType;
import com.eze_dev.torneos.types.GenderType;

import java.util.List;
import java.util.UUID;

public interface IPlayerStandingService {

    PlayerStandingResponseDto getPlayerStandingById(UUID id);
    List<PlayerStandingResponseDto> getAllPlayersStandings();
    List<PlayerRankingResponseDto> getPlayerRankings(CategoryType category, GenderType gender);
}
