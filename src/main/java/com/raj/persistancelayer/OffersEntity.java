package com.raj.persistancelayer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class OffersEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int offerId;
	@Column
	private String offerName;
	@Column
	private String redirectLink;
	@Column
	private String unsubLink;
	@Column
	private float payout;
	@Column
	private String cpcOrCpa;
	

}
