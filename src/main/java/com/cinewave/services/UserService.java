package com.cinewave.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cinewave.model.UserEntity;
import com.cinewave.repositories.UserRepository;

@Service
public class UserService 
{
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public List<UserEntity> getUsers()
	{
		return userRepository.findAll();
	}
	
	public UserEntity createUser(UserEntity user)
	{
//		user.setUserId(UUID.randomUUID().toString());
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		System.out.println(user);
		return userRepository.save(user);
	}
	
}
