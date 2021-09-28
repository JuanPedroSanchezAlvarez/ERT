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
public class SpellDTO extends BaseDTO {

	@NotBlank
	@Size(max = 25)
	private String name;

	@NotNull
	@PositiveOrZero
	private Integer level;

	@NotBlank
	@Size(max = 75)
	private String powerPoints;

	@NotNull
	@PositiveOrZero
	private Integer learningDifficulty;

	@NotNull
	@PositiveOrZero
	private Integer castingDifficulty;

	@NotBlank
	@Size(max = 300)
	private String effect;

	@NotEmpty
	private List<MagicAspectDTO> listOfMagicAspects;

}
