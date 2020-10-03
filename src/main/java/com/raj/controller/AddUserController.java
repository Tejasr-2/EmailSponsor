package com.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.raj.dto.Users;

@Controller
public class AddUserController {
	
	
	
	@PostMapping("/Adduser")
	public void adduser(@ModelAttribute("user") Users user) {
		
		
		
		
		
		
	}
	

}
