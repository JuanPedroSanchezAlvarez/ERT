package com.ert.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "skills")
public class Skill extends BaseEntity {

	private static final long serialVersionUID = -831517296726237247L;

	@Column(length = 25)
	private String name;

	@Column(length = 25)
	private String nombre;

}
