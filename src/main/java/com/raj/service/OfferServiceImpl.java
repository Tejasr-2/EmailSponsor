package com.raj.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raj.dto.Offers;
import com.raj.persistancelayer.OffersEntity;
import com.raj.persistancelayer.OffersRepo;


@Service
public class OfferServiceImpl implements OfferService {

	@Autowired
	private OffersRepo offerRepo;
	
	
	@Override
	public void addoffer(Offers offer) {
		
	OffersEntity entity = new OffersEntity();
	BeanUtils.copyProperties(offer, entity);
	
	offerRepo.save(entity);
	

	}


	@Override
	public List<Offers> getAllOffers() {
		
		List<OffersEntity> offerEntities = offerRepo.findAll();
 		List<Offers> offers = new ArrayList<>();
 		
		for(OffersEntity entity : offerEntities) {
			Offers offer = new Offers();
			BeanUtils.copyProperties(entity, offer);
			offers.add(offer);
		}
		
		
		return offers;
	}


	@Override
	public Offers getOfferById(int offerid) {
		
		Optional<OffersEntity> optional = offerRepo.findById(offerid);
		OffersEntity entity = optional.get();
		Offers offer = new Offers();
		BeanUtils.copyProperties(entity, offer);
		
		
		return offer;
	}


	@Override
	public void deleteOfferById(int offerid) {
		
		offerRepo.deleteById(offerid);
		
		
	}

}
