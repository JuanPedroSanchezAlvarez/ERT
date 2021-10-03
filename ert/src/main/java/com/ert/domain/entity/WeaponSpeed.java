package com.ert.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "weapon_speeds")
public class WeaponSpeed extends BaseEntity {

	private static final long serialVersionUID = 2335471033228577454L;

	@Column(length = 20)
	private String name;

}
