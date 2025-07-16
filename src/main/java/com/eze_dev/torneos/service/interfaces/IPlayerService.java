package com.eze_dev.torneos.service.interfaces;

import com.eze_dev.torneos.dto.create.PlayerCreateDto;
import com.eze_dev.torneos.dto.response.PlayerResponseDto;
import com.eze_dev.torneos.dto.response.PlayerStandingResponseDto;
import com.eze_dev.torneos.dto.update.PlayerUpdateDto;

import java.util.List;
import java.util.UUID;

public interface IPlayerService {

    PlayerResponseDto create(PlayerCreateDto player);
    List<PlayerResponseDto> getAll();
    PlayerResponseDto getById(UUID id);
    PlayerResponseDto update(UUID id, PlayerUpdateDto player);
    void delete(UUID id);
}
