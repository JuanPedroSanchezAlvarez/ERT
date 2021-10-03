package com.ert.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ert.domain.entity.WeaponCategory;
import com.ert.dto.WeaponCategoryDTO;

@Mapper
public interface IWeaponCategoryMapper {

	IWeaponCategoryMapper INSTANCE = Mappers.getMapper(IWeaponCategoryMapper.class);

	WeaponCategoryDTO entityToDto(WeaponCategory entity);
	WeaponCategory dtoToEntity(WeaponCategoryDTO dto);

}
