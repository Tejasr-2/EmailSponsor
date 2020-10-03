package com.raj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raj.dto.Users;
import com.raj.persistancelayer.UsersEntity;
import com.raj.persistancelayer.UsersRepo;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UsersRepo userRepo;

	@Override
	public int checkRole(Users user) {

		String role = userRepo.findByName(user.getName()).getRole();
		return role.equals("admin")?1:0;
	}

	@Override
	public int checkUsename(String name) {
		
		UsersEntity entity =userRepo.findByName(name);
		
		
		if(entity == null)
		{
			return 0;
		}		
		
		
		return 1;
	}

	@Override
	public boolean checkPassword(String name, String pass) {
		
		UsersEntity entity = userRepo.findByNameAndPass(name, pass);
		
		if(entity == null)
		{
			return false;
		}
			
		return true;
	}

}
