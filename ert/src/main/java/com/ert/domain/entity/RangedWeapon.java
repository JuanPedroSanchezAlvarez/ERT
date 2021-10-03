package com.ert.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "ranged_weapons")
public class RangedWeapon extends BaseEntity {

	private static final long serialVersionUID = 5102211930240550978L;

	@Column(length = 20)
	private String name;

}
