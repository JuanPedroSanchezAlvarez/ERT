package com.ert.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class RaceDTO extends BaseDTO {

	@NotBlank
	@Size(max = 20)
	private String name;
	
	@NotBlank
	@Size(max = 20)
	private String parentRace;

	@NotNull
	@Positive
	private Integer attributesPhysical;
	@NotNull
	@Positive
	private Integer attributesMental;
	@NotNull
	@Positive
	private Integer attributesSpiritual;

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
	private Integer lifeMultiplier;

}
