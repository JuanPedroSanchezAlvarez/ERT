package com.ert.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ert.domain.entity.WeaponSize;
import com.ert.dto.WeaponSizeDTO;

@Mapper
public interface IWeaponSizeMapper {

	IWeaponSizeMapper INSTANCE = Mappers.getMapper(IWeaponSizeMapper.class);

	WeaponSizeDTO entityToDto(WeaponSize entity);
	WeaponSize dtoToEntity(WeaponSizeDTO dto);

}
