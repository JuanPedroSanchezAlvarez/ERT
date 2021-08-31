package com.ert.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ert.domain.entity.KitSkill;
import com.ert.dto.KitSkillDTO;

@Mapper
public interface IKitSkillMapper {

	IKitSkillMapper INSTANCE = Mappers.getMapper(IKitSkillMapper.class);

	KitSkillDTO entityToDto(KitSkill entity);
	KitSkill dtoToEntity(KitSkillDTO dto);

}
