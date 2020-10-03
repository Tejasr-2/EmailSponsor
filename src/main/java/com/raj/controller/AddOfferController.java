package com.raj.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.raj.dto.Offers;
import com.raj.service.OfferService;

@Controller
public class AddOfferController {

	private OfferService offerService;

	public AddOfferController(OfferService theOfferService) {
		offerService = theOfferService;
	}

	@PostMapping("/addOffer")
	public String addOffer(@ModelAttribute("offer") Offers offer) {

		offerService.addoffer(offer);

		return "redirect:/adminLogin";

	}

	@GetMapping("/addOffer")
	public String addOffer1(Model model) {
		model.addAttribute("offer", new Offers());
		// offerService.addoffer(offer);
		return "redirect:/";
	}

	@GetMapping("/addOfferPage")
	public String addOfferpage(Model model) {

		model.addAttribute("offer", new Offers());
		return "addOfferPage";
	}

	@GetMapping("/adminLogin")
	public String adminPage(Model model) {

		List<Offers> offers = offerService.getAllOffers();

		model.addAttribute("allOffers", offers);

		return "adminLogin";
	}

	@GetMapping("/editOffer")
	public String edotOffer(@ModelAttribute("id") int offerid,Model model) {

		Offers offer = offerService.getOfferById(offerid);
		
		model.addAttribute("offer",offer);
		return "addOfferPage";
	}
	
	@GetMapping("/deleteOffer")
	public String deleteOffer(@ModelAttribute("id") int offerid) {

		offerService.deleteOfferById(offerid);
		
		
		return "redirect:/adminLogin";
	}

}
