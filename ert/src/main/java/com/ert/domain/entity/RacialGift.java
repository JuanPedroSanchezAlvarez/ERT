package com.ert.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "racial_gifts")
public class RacialGift extends BaseEntity {

	private static final long serialVersionUID = -7920850067500221564L;

	@Column(length = 40)
	private String name;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "race_id")
	private Race race;

}
