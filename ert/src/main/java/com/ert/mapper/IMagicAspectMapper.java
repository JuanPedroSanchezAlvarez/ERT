package com.ert.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ert.domain.entity.MagicAspect;
import com.ert.dto.MagicAspectDTO;

@Mapper
public interface IMagicAspectMapper {

	IMagicAspectMapper INSTANCE = Mappers.getMapper(IMagicAspectMapper.class);

	MagicAspectDTO entityToDto(MagicAspect entity);
	MagicAspect dtoToEntity(MagicAspectDTO dto);

}
