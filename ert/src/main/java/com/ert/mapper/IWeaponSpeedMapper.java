package com.ert.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ert.domain.entity.WeaponSpeed;
import com.ert.dto.WeaponSpeedDTO;

@Mapper
public interface IWeaponSpeedMapper {

	IWeaponSpeedMapper INSTANCE = Mappers.getMapper(IWeaponSpeedMapper.class);

	WeaponSpeedDTO entityToDto(WeaponSpeed entity);
	WeaponSpeed dtoToEntity(WeaponSpeedDTO dto);

}
