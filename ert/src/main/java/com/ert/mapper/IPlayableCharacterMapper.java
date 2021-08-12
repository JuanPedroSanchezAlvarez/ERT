package com.ert.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ert.domain.entity.PlayableCharacter;
import com.ert.dto.PlayableCharacterDTO;

@Mapper
public interface IPlayableCharacterMapper {

	IPlayableCharacterMapper INSTANCE = Mappers.getMapper(IPlayableCharacterMapper.class);

	PlayableCharacterDTO entityToDto(PlayableCharacter entity);
	PlayableCharacter dtoToEntity(PlayableCharacterDTO dto);

}
