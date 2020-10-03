package com.raj.persistancelayer;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends JpaRepository<UsersEntity, Serializable> {

	public UsersEntity findByName(String name);

	public UsersEntity findByNameAndPass(String name, String pass);
}
