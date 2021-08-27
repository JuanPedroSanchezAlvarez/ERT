package com.ert.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class RacialGiftDTO extends BaseDTO {

	@NotBlank
	@Size(max = 40)
	private String name;

	@NotNull
	private RaceDTO race;

}
