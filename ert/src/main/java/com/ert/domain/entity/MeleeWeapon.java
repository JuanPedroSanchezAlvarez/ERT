package com.ert.domain.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "melee_weapons")
public class MeleeWeapon extends BaseEntity {

	private static final long serialVersionUID = 833777809867691061L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "weapon_category_id")
	private WeaponCategory category;

	@Column(length = 20)
	private String name;

	@Column(length = 15)
	private String damage;

	@Column(length = 15)
	private String penetration;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "weapon_speed_id")
	private WeaponSpeed speed;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "weapon_size_id")
	private WeaponSize size;

	@Column(name = "two_handed")
	private Boolean twoHanded;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "melee_weapons_skills", joinColumns = @JoinColumn(name = "melee_weapon_id"), inverseJoinColumns = @JoinColumn(name = "skill_id"), uniqueConstraints = { @UniqueConstraint(columnNames = { "melee_weapon_id", "skill_id" }) })
	private List<WeaponSkill> listOfWeaponSkills;

	private Integer cost;

}
