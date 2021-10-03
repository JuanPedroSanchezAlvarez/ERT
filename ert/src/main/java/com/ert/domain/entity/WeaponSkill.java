package com.ert.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "weapon_skills")
public class WeaponSkill extends BaseEntity {

	private static final long serialVersionUID = -6116360236564925729L;

	@Column(length = 20)
	private String name;

	// @ManyToMany(mappedBy = "listOfWeaponSkills")
	// private List<MeleeWeapon> listOfMeleeWeapons;

}
