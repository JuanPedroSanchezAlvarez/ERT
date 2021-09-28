package com.ert.domain.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

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

	@Column(length = 1500)
	private String effect;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "spells_magic_aspects", joinColumns = @JoinColumn(name = "spell_id"), inverseJoinColumns = @JoinColumn(name = "magic_aspect_id"), uniqueConstraints = { @UniqueConstraint(columnNames = { "spell_id", "magic_aspect_id" }) })
	private List<MagicAspect> listOfMagicAspects;

}
