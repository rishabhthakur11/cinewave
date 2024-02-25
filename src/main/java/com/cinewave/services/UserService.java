package com.cinewave.services;

import com.cinewave.model.UserEntity;
import com.cinewave.repositories.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private PasswordEncoder passwordEncoder;

  public List<UserEntity> getAllUsers() {
    return userRepository.findAll();
  }

  public UserEntity createUser(UserEntity user) {
    user.setPassword(passwordEncoder.encode(user.getPassword()));
    System.out.println("user created" + user.getEmail());
    return userRepository.save(user);
  }
}
