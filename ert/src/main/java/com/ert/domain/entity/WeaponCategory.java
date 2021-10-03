package com.ert.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "weapon_categories")
public class WeaponCategory extends BaseEntity {

	private static final long serialVersionUID = -721979233403779347L;

	@Column(length = 20)
	private String name;

}
