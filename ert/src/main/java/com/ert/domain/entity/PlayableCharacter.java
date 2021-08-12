package com.ert.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "characters")
public class PlayableCharacter extends BaseEntity {

	private static final long serialVersionUID = 7744139550232835341L;

	@Column(length = 20)
	private String name;

}
