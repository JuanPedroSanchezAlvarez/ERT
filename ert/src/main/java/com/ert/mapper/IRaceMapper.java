package com.ert.mapper;

import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ert.domain.entity.Race;
import com.ert.dto.RaceDTO;

@Mapper
public interface IRaceMapper {

	IRaceMapper INSTANCE = Mappers.getMapper(IRaceMapper.class);

	RaceDTO entityToDto(Race entity, @Context CycleAvoidingMappingContext context);
	Race dtoToEntity(RaceDTO dto, @Context CycleAvoidingMappingContext context);

}
