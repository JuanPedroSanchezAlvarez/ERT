package com.ert.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ert.domain.entity.MeleeWeapon;
import com.ert.dto.MeleeWeaponDTO;

@Mapper
public interface IMeleeWeaponMapper {

	IMeleeWeaponMapper INSTANCE = Mappers.getMapper(IMeleeWeaponMapper.class);

	MeleeWeaponDTO entityToDto(MeleeWeapon entity);
	MeleeWeapon dtoToEntity(MeleeWeaponDTO dto);

}
