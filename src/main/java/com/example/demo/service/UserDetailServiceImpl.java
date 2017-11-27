package com.example.demo.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.demo.Entity.User;
import com.example.demo.repository.UserRepository;

public class UserDetailServiceImpl implements UserDetailService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUserName(String userName) {
		User user = userRepository.findByUserName(userName);
		Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
		grantedAuthorities.add(new SimpleGrantedAuthority("admin"));
		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),grantedAuthorities); 
	}

	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

}
