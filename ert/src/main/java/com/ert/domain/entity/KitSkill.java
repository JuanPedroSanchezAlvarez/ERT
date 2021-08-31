package com.ert.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "kits_skills")
public class KitSkill extends BaseEntity {

	private static final long serialVersionUID = -8092853762891193646L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "kit_id")
	private Kit kit;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "skill_id")
	private Skill skill;

	@Column(length = 1, name = "training_level")
	private String trainingLevel;

}
