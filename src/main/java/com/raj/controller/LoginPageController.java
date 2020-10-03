package com.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.raj.dto.Users;
import com.raj.service.LoginService;

@Controller
public class LoginPageController {

	private LoginService loginService;
	

	public LoginPageController(LoginService theloginService) {

		loginService = theloginService;
	}

	@GetMapping("/")
	public String handleLogin(Model model) {
		model.addAttribute("user", new Users());

		System.out.println("Login Page Invoked");
		return "Login";
	}

	@PostMapping("/doLogin")
	public String verifyLogin(@ModelAttribute("user") Users user, Model model) {

		System.out.println("Clicked on Login button");

		if (loginService.checkUsename(user.getName()) == 0) {
			System.out.println("Wrong USername");
			model.addAttribute("user", new Users());
			return "Login";
		} else {
			if (loginService.checkPassword(user.getName(), user.getPass())) {
				if (loginService.checkRole(user) == 0) {

					return "userLogin";
				} else {
					return "redirect:/adminLogin";
				}
			}
			System.out.println("Wrong Password");
			model.addAttribute("user", new Users());
			return "Login";

		}

	}
	
	

//	@GetMapping("/doLogin")
//	public void foLogin() {
//		
//		
//	}

}
