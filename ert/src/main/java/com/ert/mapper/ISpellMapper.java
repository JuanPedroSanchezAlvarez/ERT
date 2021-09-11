package com.ert.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ert.domain.entity.Spell;
import com.ert.dto.SpellDTO;

@Mapper
public interface ISpellMapper {

	ISpellMapper INSTANCE = Mappers.getMapper(ISpellMapper.class);

	SpellDTO entityToDto(Spell entity);
	Spell dtoToEntity(SpellDTO dto);

}
