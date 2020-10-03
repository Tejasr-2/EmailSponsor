package com.raj.dto;

import lombok.Data;

@Data
public class Offers {

	private int offerId;
	private String offerName;
	private String redirectLink;
	private String unsubLink;
	private float payout;
	private String cpcOrCpa;
}
