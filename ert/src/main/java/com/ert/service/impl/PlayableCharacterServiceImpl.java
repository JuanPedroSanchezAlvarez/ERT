package com.ert.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ert.domain.entity.PlayableCharacter;
import com.ert.domain.repository.IPlayableCharacterRepository;
import com.ert.dto.PlayableCharacterDTO;
import com.ert.mapper.IPlayableCharacterMapper;
import com.ert.service.IPlayableCharacterService;
import com.ert.util.LoggingUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PlayableCharacterServiceImpl implements IPlayableCharacterService {

	private final IPlayableCharacterRepository repository;

	public PlayableCharacterServiceImpl(IPlayableCharacterRepository repository) {
		this.repository = repository;
	}

	@Override
	@Transactional(readOnly = true)
	public List<PlayableCharacterDTO> findAll() {
		log.debug("LOG: Class: " + this.getClass().getName() + " --> Method: " + LoggingUtils.getCurrentMethodName());
		List<PlayableCharacter> listEntity = (List<PlayableCharacter>) repository.findAll();
		List<PlayableCharacterDTO> listDTO = new ArrayList<>();
		listEntity.forEach((entity) -> { listDTO.add(IPlayableCharacterMapper.INSTANCE.entityToDto(entity)); });
		return listDTO;
	}

	@Override
	@Transactional(readOnly = true)
	public PlayableCharacterDTO findById(Long id) {
		log.debug("LOG: Class: " + this.getClass().getName() + " --> Method: " + LoggingUtils.getCurrentMethodName());
		return IPlayableCharacterMapper.INSTANCE.entityToDto(repository.findById(id).orElse(null));
	}

	@Override
	@Transactional
	public PlayableCharacterDTO save(PlayableCharacterDTO o) {
		log.debug("LOG: Class: " + this.getClass().getName() + " --> Method: " + LoggingUtils.getCurrentMethodName());
		return IPlayableCharacterMapper.INSTANCE.entityToDto(repository.save(IPlayableCharacterMapper.INSTANCE.dtoToEntity(o)));
	}

	@Override
	@Transactional
	public Boolean deleteById(Long id) {
		log.debug("LOG: Class: " + this.getClass().getName() + " --> Method: " + LoggingUtils.getCurrentMethodName());
		if (repository.existsById(id)) {
			repository.deleteById(id);
			return true;
		}
		return false;
	}

}
