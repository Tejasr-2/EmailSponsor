package com.raj.service;

import java.util.List;

import com.raj.dto.Offers;

public interface OfferService {

	
	public void addoffer(Offers offer);

	public List<Offers> getAllOffers();

	public Offers getOfferById(int offerid);

	public void deleteOfferById(int offerid);
}
