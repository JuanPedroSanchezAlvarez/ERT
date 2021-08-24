package com.ert.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "characters")
public class PlayableCharacter extends BaseEntity {

	private static final long serialVersionUID = 7744139550232835341L;

	@Column(length = 20)
	private String name;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "race_id")
	private Race race;

	@Column(name = "attribute_strength")
	private Integer attributeStrength;
	@Column(name = "attribute_dexterity")
	private Integer attributeDexterity;
	@Column(name = "attribute_agility")
	private Integer attributeAgility;
	@Column(name = "attribute_vigor")
	private Integer attributeVigor;
	@Column(name = "attribute_reasoning")
	private Integer attributeReasoning;
	@Column(name = "attribute_memory")
	private Integer attributeMemory;
	@Column(name = "attribute_perception")
	private Integer attributePerception;
	@Column(name = "attribute_charisma")
	private Integer attributeCharisma;
	@Column(name = "attribute_will")
	private Integer attributeWill;
	@Column(name = "attribute_wisdom")
	private Integer attributeWisdom;
	@Column(name = "attribute_intuition")
	private Integer attributeIntuition;
	@Column(name = "attribute_faith")
	private Integer attributeFaith;

	@Column(name = "skill_craft")
	private Integer skillCraft;
	@Column(name = "skill_alert")
	private Integer skillAlert;
	@Column(name = "skill_melee_weapons")
	private Integer skillMeleeWeapons;
	@Column(name = "skill_ranged_weapons")
	private Integer skillRangedWeapons;
	@Column(name = "skill_astrology")
	private Integer skillAstrology;
	@Column(name = "skill_athletics")
	private Integer skillAthletics;
	@Column(name = "skill_bestiary")
	private Integer skillBestiary;
	@Column(name = "skill_commerce")
	private Integer skillCommerce;
	@Column(name = "skill_religion")
	private Integer skillReligion;
	@Column(name = "skill_poisons")
	private Integer skillPoisons;
	@Column(name = "skill_healing")
	private Integer skillHealing;
	@Column(name = "skill_dodge")
	private Integer skillDodge;
	@Column(name = "skill_etiquette")
	private Integer skillEtiquette;
	@Column(name = "skill_forging")
	private Integer skillForging;
	@Column(name = "skill_foraging")
	private Integer skillForaging;
	@Column(name = "skill_art")
	private Integer skillArt;
	@Column(name = "skill_history")
	private Integer skillHistory;
	@Column(name = "skill_initiative")
	private Integer skillInitiative;
	@Column(name = "skill_investigate")
	private Integer skillInvestigate;
	@Column(name = "skill_languages")
	private Integer skillLanguages;
	@Column(name = "skill_juggle")
	private Integer skillJuggle;
	@Column(name = "skill_mount")
	private Integer skillMount;
	@Column(name = "skill_swim")
	private Integer skillSwim;
	@Column(name = "skill_watch")
	private Integer skillWatch;
	@Column(name = "skill_oratory")
	private Integer skillOratory;
	@Column(name = "skill_fight")
	private Integer skillFight;
	@Column(name = "skill_politics")
	private Integer skillPolitics;
	@Column(name = "skill_track")
	private Integer skillTrack;
	@Column(name = "skill_haggling")
	private Integer skillHaggling;
	@Column(name = "skill_steal")
	private Integer skillSteal;
	@Column(name = "skill_stealth")
	private Integer skillStealth;
	@Column(name = "skill_traps")
	private Integer skillTraps;
	@Column(name = "skill_use_gifts")
	private Integer skillUseGifts;
	@Column(name = "skill_use_magic_items")
	private Integer skillUseMagicItems;
	@Column(name = "skill_use_powers")
	private Integer skillUsePowers;

	@PrePersist
	@PreUpdate
	private void preSave() {

	}

}
