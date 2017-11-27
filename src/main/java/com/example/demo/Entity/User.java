package com.example.demo.Entity;

import javax.persistence.GeneratedValue;

public class User {
	
	@javax.persistence.Id
	@GeneratedValue
	private Long Id;
	
	private String userName;
	
	private String password;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
