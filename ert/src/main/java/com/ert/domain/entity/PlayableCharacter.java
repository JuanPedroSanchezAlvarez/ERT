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

	@PrePersist
	@PreUpdate
	private void preSave() {

	}

}
