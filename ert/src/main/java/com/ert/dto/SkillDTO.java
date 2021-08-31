package com.ert.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class SkillDTO extends BaseDTO {

	@NotBlank
	@Size(max = 25)
	private String name;

	@NotBlank
	@Size(max = 25)
	private String nombre;

}
