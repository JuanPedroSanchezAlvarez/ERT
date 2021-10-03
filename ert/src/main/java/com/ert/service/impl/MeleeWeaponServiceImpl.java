package com.ert.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ert.domain.entity.MeleeWeapon;
import com.ert.domain.repository.IMeleeWeaponRepository;
import com.ert.dto.MeleeWeaponDTO;
import com.ert.mapper.IMeleeWeaponMapper;
import com.ert.service.IMeleeWeaponService;
import com.ert.util.LoggingUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MeleeWeaponServiceImpl implements IMeleeWeaponService {

	private final IMeleeWeaponRepository repository;

	public MeleeWeaponServiceImpl(IMeleeWeaponRepository repository) {
		this.repository = repository;
	}

	@Override
	@Transactional(readOnly = true)
	public List<MeleeWeaponDTO> findAll() {
		log.debug("LOG: Class: " + this.getClass().getName() + " --> Method: " + LoggingUtils.getCurrentMethodName());
		List<MeleeWeapon> listEntity = (List<MeleeWeapon>) repository.findAll();
		List<MeleeWeaponDTO> listDTO = new ArrayList<>();
		listEntity.forEach((entity) -> { listDTO.add(IMeleeWeaponMapper.INSTANCE.entityToDto(entity)); });
		return listDTO;
	}

	@Override
	@Transactional(readOnly = true)
	public MeleeWeaponDTO findById(Long id) {
		log.debug("LOG: Class: " + this.getClass().getName() + " --> Method: " + LoggingUtils.getCurrentMethodName());
		return IMeleeWeaponMapper.INSTANCE.entityToDto(repository.findById(id).orElse(null));
	}

	@Override
	@Transactional
	public MeleeWeaponDTO save(MeleeWeaponDTO o) {
		log.debug("LOG: Class: " + this.getClass().getName() + " --> Method: " + LoggingUtils.getCurrentMethodName());
		return IMeleeWeaponMapper.INSTANCE.entityToDto(repository.save(IMeleeWeaponMapper.INSTANCE.dtoToEntity(o)));
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
