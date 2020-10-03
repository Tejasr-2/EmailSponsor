package com.raj.service;

import com.raj.dto.Users;


public interface LoginService {
	
	
	
	
	public int checkRole(Users user);
	
	public int checkUsename(String name);
	
	public boolean checkPassword(String name, String pass);
	

}
