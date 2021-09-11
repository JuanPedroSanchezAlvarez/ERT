package com.ert.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ert.domain.entity.Spell;
import com.ert.domain.repository.ISpellRepository;
import com.ert.dto.SpellDTO;
import com.ert.mapper.ISpellMapper;
import com.ert.service.ISpellService;
import com.ert.util.LoggingUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SpellServiceImpl implements ISpellService {

	private final ISpellRepository repository;

	public SpellServiceImpl(ISpellRepository repository) {
		this.repository = repository;
	}

	@Override
	@Transactional(readOnly = true)
	public List<SpellDTO> findAll() {
		log.debug("LOG: Class: " + this.getClass().getName() + " --> Method: " + LoggingUtils.getCurrentMethodName());
		List<Spell> listEntity = (List<Spell>) repository.findAll();
		List<SpellDTO> listDTO = new ArrayList<>();
		listEntity.forEach((entity) -> { listDTO.add(ISpellMapper.INSTANCE.entityToDto(entity)); });
		return listDTO;
	}

	@Override
	@Transactional(readOnly = true)
	public SpellDTO findById(Long id) {
		log.debug("LOG: Class: " + this.getClass().getName() + " --> Method: " + LoggingUtils.getCurrentMethodName());
		return ISpellMapper.INSTANCE.entityToDto(repository.findById(id).orElse(null));
	}

	@Override
	@Transactional
	public SpellDTO save(SpellDTO o) {
		log.debug("LOG: Class: " + this.getClass().getName() + " --> Method: " + LoggingUtils.getCurrentMethodName());
		return ISpellMapper.INSTANCE.entityToDto(repository.save(ISpellMapper.INSTANCE.dtoToEntity(o)));
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
