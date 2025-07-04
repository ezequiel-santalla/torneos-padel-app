package com.eze_dev.torneos.mapper;

import com.eze_dev.torneos.dto.create.PairCreateDto;
import com.eze_dev.torneos.dto.response.PairResponseDto;
import com.eze_dev.torneos.dto.update.PairUpdateDto;
import com.eze_dev.torneos.model.Pair;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring", uses = { PlayerSummaryMapper.class })
public interface PairMapper {

    Pair toEntity(PairCreateDto pairCreateDto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(PairUpdateDto pairUpdateDto, @MappingTarget Pair entity);

    PairResponseDto toDto(Pair pair);

    List<PairResponseDto> toDtoList(List<Pair> pairs);
}
