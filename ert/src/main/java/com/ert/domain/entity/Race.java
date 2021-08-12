package com.ert.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "races")
public class Race extends BaseEntity {

	private static final long serialVersionUID = 4918468625998050022L;

	@Column(length = 20)
	private String name;

}
