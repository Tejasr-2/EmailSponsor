package com.raj.persistancelayer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;


@Data
@Entity
public class UsersEntity {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int userId;
	@Column
	private String name;
	@Column
	private String pass;
	@Column
	private String role;

}
