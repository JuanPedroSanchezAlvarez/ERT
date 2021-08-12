package com.ert.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ert.domain.entity.Kit;
import com.ert.dto.KitDTO;

@Mapper
public interface IKitMapper {

	IKitMapper INSTANCE = Mappers.getMapper(IKitMapper.class);

	KitDTO entityToDto(Kit entity);
	Kit dtoToEntity(KitDTO dto);

}
