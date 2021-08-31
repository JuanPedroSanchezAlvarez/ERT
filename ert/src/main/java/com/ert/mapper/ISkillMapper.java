package com.ert.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ert.domain.entity.Skill;
import com.ert.dto.SkillDTO;

@Mapper
public interface ISkillMapper {

	ISkillMapper INSTANCE = Mappers.getMapper(ISkillMapper.class);

	SkillDTO entityToDto(Skill entity);
	Skill dtoToEntity(SkillDTO dto);

}
