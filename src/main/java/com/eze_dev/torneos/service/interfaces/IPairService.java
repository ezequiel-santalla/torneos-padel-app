package com.eze_dev.torneos.service.interfaces;

import com.eze_dev.torneos.dto.create.PairCreateDto;
import com.eze_dev.torneos.dto.response.PairResponseDto;
import com.eze_dev.torneos.dto.update.PairUpdateDto;

import java.util.List;
import java.util.UUID;

public interface IPairService {

    PairResponseDto create(PairCreateDto pairCreateDto);
    List<PairResponseDto> getAll();
    PairResponseDto getById(UUID id);
    PairResponseDto update(UUID id, PairUpdateDto pairUpdateDto);
    void delete(UUID id);

    List<PairResponseDto> getPairsByPlayerId(UUID playerId);
    boolean existsByTeamName(String teamName);
}

