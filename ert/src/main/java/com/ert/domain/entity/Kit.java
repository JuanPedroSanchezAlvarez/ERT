package com.ert.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "kits")
public class Kit extends BaseEntity {

	private static final long serialVersionUID = 4323461075342052964L;

	@Column(length = 20)
	private String name;

}
