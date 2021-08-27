package com.ert.mapper;

import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ert.domain.entity.RacialGift;
import com.ert.dto.RacialGiftDTO;

@Mapper
public interface IRacialGiftMapper {

	IRacialGiftMapper INSTANCE = Mappers.getMapper(IRacialGiftMapper.class);

	RacialGiftDTO entityToDto(RacialGift entity, @Context CycleAvoidingMappingContext context);
	RacialGift dtoToEntity(RacialGiftDTO dto, @Context CycleAvoidingMappingContext context);

}
