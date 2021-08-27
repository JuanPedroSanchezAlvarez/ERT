package com.ert.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ert.domain.entity.Race;
import com.ert.domain.repository.IRaceRepository;
import com.ert.dto.RaceDTO;
import com.ert.mapper.CycleAvoidingMappingContext;
import com.ert.mapper.IRaceMapper;
import com.ert.service.IRaceService;
import com.ert.util.LoggingUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RaceServiceImpl implements IRaceService {

	private final IRaceRepository repository;

	public RaceServiceImpl(IRaceRepository repository) {
		this.repository = repository;
	}

	@Override
	@Transactional(readOnly = true)
	public List<RaceDTO> findAll() {
		log.debug("LOG: Class: " + this.getClass().getName() + " --> Method: " + LoggingUtils.getCurrentMethodName());
		List<Race> listEntity = (List<Race>) repository.findAll();
		List<RaceDTO> listDTO = new ArrayList<>();
		listEntity.forEach((entity) -> { listDTO.add(IRaceMapper.INSTANCE.entityToDto(entity, new CycleAvoidingMappingContext())); });
		return listDTO;
	}

	@Override
	@Transactional(readOnly = true)
	public RaceDTO findById(Long id) {
		log.debug("LOG: Class: " + this.getClass().getName() + " --> Method: " + LoggingUtils.getCurrentMethodName());
		return IRaceMapper.INSTANCE.entityToDto(repository.findById(id).orElse(null), new CycleAvoidingMappingContext());
	}

	@Override
	@Transactional
	public RaceDTO save(RaceDTO o) {
		log.debug("LOG: Class: " + this.getClass().getName() + " --> Method: " + LoggingUtils.getCurrentMethodName());
		return IRaceMapper.INSTANCE.entityToDto(repository.save(IRaceMapper.INSTANCE.dtoToEntity(o, new CycleAvoidingMappingContext())), new CycleAvoidingMappingContext());
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
