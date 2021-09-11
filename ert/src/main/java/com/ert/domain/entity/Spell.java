package com.ert.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "spells")
public class Spell extends BaseEntity {

	private static final long serialVersionUID = -8843367238881838095L;

	@Column(length = 25)
	private String name;

	private Integer level;

	@Column(length = 75, name = "power_points")
	private String powerPoints;

	@Column(name = "learning_difficulty")
	private Integer learningDifficulty;

	@Column(name = "casting_difficulty")
	private Integer castingDifficulty;

	@Column(length = 300)
	private String effect;

}
