package com.eze_dev.torneos.mapper;

import com.eze_dev.torneos.dto.create.PlayerCreateDto;
import com.eze_dev.torneos.dto.update.PlayerUpdateDto;
import com.eze_dev.torneos.dto.response.PlayerResponseDto;
import com.eze_dev.torneos.model.Player;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PlayerMapper {

    // Crear entidad desde DTO
    Player toEntity(PlayerCreateDto playerCreateDto);

    // Actualizar entidad ignorando nulos
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(PlayerUpdateDto playerUpdateDto, @MappingTarget Player entity);

    // Mapear entidad a DTO respuesta
    PlayerResponseDto toDto(Player player);

    // Mapear lista de entidades a lista de DTOs
    List<PlayerResponseDto> toDtoList(List<Player> players);
}
