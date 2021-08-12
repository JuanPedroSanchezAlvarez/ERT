package com.ert.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PlayableCharacterDTO extends BaseDTO {

	@NotBlank
	@Size(max = 20)
	private String name;

}
