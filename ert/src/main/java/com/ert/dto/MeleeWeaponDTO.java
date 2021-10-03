package com.ert.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MeleeWeaponDTO extends BaseDTO {

	@NotNull
	private WeaponCategoryDTO category;

	@NotBlank
	@Size(max = 20)
	private String name;

	@NotBlank
	@Size(max = 15)
	private String damage;

	@NotBlank
	@Size(max = 15)
	private String penetration;

	@NotNull
	private WeaponSpeedDTO speed;

	@NotNull
	private WeaponSizeDTO size;

	@NotNull
	private Boolean twoHanded;

	@NotEmpty
	private List<WeaponSkillDTO> listOfWeaponSkills;

	@NotNull
	@PositiveOrZero
	private Integer cost;

}
