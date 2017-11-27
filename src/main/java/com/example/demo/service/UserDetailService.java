package com.example.demo.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface UserDetailService {
	
	public UserDetails loadUserByUserName(String userName);

}
