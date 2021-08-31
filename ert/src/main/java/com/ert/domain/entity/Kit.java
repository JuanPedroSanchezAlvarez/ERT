package com.ert.domain.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "kits")
public class Kit extends BaseEntity {

	private static final long serialVersionUID = 4323461075342052964L;

	@Column(length = 35)
	private String name;

	@Column(name = "balance_law")
	private Integer balanceLaw;
	@Column(name = "balance_magic")
	private Integer balanceMagic;
	@Column(name = "balance_chaos")
	private Integer balanceChaos;

	private Integer life;

	@Column(length = 30)
	private String aspects;

	@OneToMany(mappedBy = "kit", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<KitSkill> listOfKitSkills;

}
