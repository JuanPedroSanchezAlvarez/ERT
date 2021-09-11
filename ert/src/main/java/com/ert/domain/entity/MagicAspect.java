package com.ert.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "magic_aspects")
public class MagicAspect extends BaseEntity {

	private static final long serialVersionUID = -4450722526081186357L;

	@Column(length = 20)
	private String name;

	
	//manytomany con hechizo
}
