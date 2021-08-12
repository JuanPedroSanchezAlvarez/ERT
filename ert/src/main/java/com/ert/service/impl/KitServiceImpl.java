package com.ert.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ert.domain.entity.Kit;
import com.ert.domain.repository.IKitRepository;
import com.ert.dto.KitDTO;
import com.ert.mapper.IKitMapper;
import com.ert.service.IKitService;
import com.ert.util.LoggingUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class KitServiceImpl implements IKitService {

	private final IKitRepository repository;

	public KitServiceImpl(IKitRepository repository) {
		this.repository = repository;
	}

	@Override
	@Transactional(readOnly = true)
	public List<KitDTO> findAll() {
		log.debug("LOG: Class: " + this.getClass().getName() + " --> Method: " + LoggingUtils.getCurrentMethodName());
		List<Kit> listEntity = (List<Kit>) repository.findAll();
		List<KitDTO> listDTO = new ArrayList<>();
		listEntity.forEach((entity) -> { listDTO.add(IKitMapper.INSTANCE.entityToDto(entity)); });
		return listDTO;
	}

	@Override
	@Transactional(readOnly = true)
	public KitDTO findById(Long id) {
		log.debug("LOG: Class: " + this.getClass().getName() + " --> Method: " + LoggingUtils.getCurrentMethodName());
		return IKitMapper.INSTANCE.entityToDto(repository.findById(id).orElse(null));
	}

	@Override
	@Transactional
	public KitDTO save(KitDTO o) {
		log.debug("LOG: Class: " + this.getClass().getName() + " --> Method: " + LoggingUtils.getCurrentMethodName());
		return IKitMapper.INSTANCE.entityToDto(repository.save(IKitMapper.INSTANCE.dtoToEntity(o)));
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
