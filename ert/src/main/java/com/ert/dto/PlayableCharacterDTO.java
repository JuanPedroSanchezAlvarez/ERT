package com.ert.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PlayableCharacterDTO extends BaseDTO {

	@NotBlank
	@Size(max = 20)
	private String name;

	@NotNull
	private RaceDTO race;

	@NotNull
	@Positive
	private Integer attributeStrength;
	@NotNull
	@Positive
	private Integer attributeDexterity;
	@NotNull
	@Positive
	private Integer attributeAgility;
	@NotNull
	@Positive
	private Integer attributeVigor;
	@NotNull
	@Positive
	private Integer attributeReasoning;
	@NotNull
	@Positive
	private Integer attributeMemory;
	@NotNull
	@Positive
	private Integer attributePerception;
	@NotNull
	@Positive
	private Integer attributeCharisma;
	@NotNull
	@Positive
	private Integer attributeWill;
	@NotNull
	@Positive
	private Integer attributeWisdom;
	@NotNull
	@Positive
	private Integer attributeIntuition;
	@NotNull
	@Positive
	private Integer attributeFaith;

}
