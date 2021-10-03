package com.ert.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ert.domain.entity.WeaponSkill;
import com.ert.dto.WeaponSkillDTO;

@Mapper
public interface IWeaponSkillMapper {

	IWeaponSkillMapper INSTANCE = Mappers.getMapper(IWeaponSkillMapper.class);

	WeaponSkillDTO entityToDto(WeaponSkill entity);
	WeaponSkill dtoToEntity(WeaponSkillDTO dto);

}
