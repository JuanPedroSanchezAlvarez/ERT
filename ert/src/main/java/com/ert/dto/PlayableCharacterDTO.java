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

	@NotNull
	@PositiveOrZero
	private Integer skillCraft;
	@NotNull
	@PositiveOrZero
	private Integer skillAlert;
	@NotNull
	@PositiveOrZero
	private Integer skillMeleeWeapons;
	@NotNull
	@PositiveOrZero
	private Integer skillRangedWeapons;
	@NotNull
	@PositiveOrZero
	private Integer skillAstrology;
	@NotNull
	@PositiveOrZero
	private Integer skillAthletics;
	@NotNull
	@PositiveOrZero
	private Integer skillBestiary;
	@NotNull
	@PositiveOrZero
	private Integer skillCommerce;
	@NotNull
	@PositiveOrZero
	private Integer skillReligion;
	@NotNull
	@PositiveOrZero
	private Integer skillPoisons;
	@NotNull
	@PositiveOrZero
	private Integer skillHealing;
	@NotNull
	@PositiveOrZero
	private Integer skillDodge;
	@NotNull
	@PositiveOrZero
	private Integer skillEtiquette;
	@NotNull
	@PositiveOrZero
	private Integer skillForging;
	@NotNull
	@PositiveOrZero
	private Integer skillForaging;
	@NotNull
	@PositiveOrZero
	private Integer skillArt;
	@NotNull
	@PositiveOrZero
	private Integer skillHistory;
	@NotNull
	@PositiveOrZero
	private Integer skillInitiative;
	@NotNull
	@PositiveOrZero
	private Integer skillInvestigate;
	@NotNull
	@PositiveOrZero
	private Integer skillLanguages;
	@NotNull
	@PositiveOrZero
	private Integer skillJuggle;
	@NotNull
	@PositiveOrZero
	private Integer skillMount;
	@NotNull
	@PositiveOrZero
	private Integer skillSwim;
	@NotNull
	@PositiveOrZero
	private Integer skillWatch;
	@NotNull
	@PositiveOrZero
	private Integer skillOratory;
	@NotNull
	@PositiveOrZero
	private Integer skillFight;
	@NotNull
	@PositiveOrZero
	private Integer skillPolitics;
	@NotNull
	@PositiveOrZero
	private Integer skillTrack;
	@NotNull
	@PositiveOrZero
	private Integer skillHaggling;
	@NotNull
	@PositiveOrZero
	private Integer skillSteal;
	@NotNull
	@PositiveOrZero
	private Integer skillStealth;
	@NotNull
	@PositiveOrZero
	private Integer skillTraps;
	@NotNull
	@PositiveOrZero
	private Integer skillUseGifts;
	@NotNull
	@PositiveOrZero
	private Integer skillUseMagicItems;
	@NotNull
	@PositiveOrZero
	private Integer skillUsePowers;

}
