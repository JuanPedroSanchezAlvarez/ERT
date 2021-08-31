package com.ert.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class KitDTO extends BaseDTO {

	@NotBlank
	@Size(max = 35)
	private String name;

	@NotNull
	@PositiveOrZero
	private Integer balanceLaw;
	@NotNull
	@PositiveOrZero
	private Integer balanceMagic;
	@NotNull
	@PositiveOrZero
	private Integer balanceChaos;

	@NotNull
	@Positive
	private Integer life;

	@NotBlank
	@Size(max = 30)
	private String aspects;

	@NotEmpty
	private List<KitSkillDTO> listOfKitSkills;

}
