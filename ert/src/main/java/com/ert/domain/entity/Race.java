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
@Table(name = "races")
public class Race extends BaseEntity {

	private static final long serialVersionUID = 4918468625998050022L;

	@Column(length = 20)
	private String name;

	@Column(length = 20, name = "parent_race")
	private String parentRace;

	@Column(name = "attributes_physical")
	private Integer attributesPhysical;
	@Column(name = "attributes_mental")
	private Integer attributesMental;
	@Column(name = "attributes_spiritual")
	private Integer attributesSpiritual;

	@Column(name = "balance_law")
	private Integer balanceLaw;
	@Column(name = "balance_magic")
	private Integer balanceMagic;
	@Column(name = "balance_chaos")
	private Integer balanceChaos;

	@Column(name = "life_multiplier")
	private Integer lifeMultiplier;

	@OneToMany(mappedBy = "race", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<RacialGift> listOfRacialGifts;

}
