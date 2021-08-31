package com.ert.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.ert.domain.entity.Kit;
import com.ert.domain.entity.Skill;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class KitSkillDTO extends BaseDTO {

	@NotNull
	private Kit kit;

	@NotNull
	private Skill skill;

	@NotBlank
	@Size(max = 1)
	private String trainingLevel;

}
