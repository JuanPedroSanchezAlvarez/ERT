package com.ert.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "weapon_sizes")
public class WeaponSize extends BaseEntity {

	private static final long serialVersionUID = -4145548095910136328L;

	@Column(length = 20)
	private String name;

}
