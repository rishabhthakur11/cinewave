package com.cinewave.controllers;

import com.cinewave.model.UserEntity;
import com.cinewave.services.UserService;
import java.security.Principal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

  @Autowired
  private UserService userSerivce;

  //http://localhost:8082/home/users

  @GetMapping("/users")
  public List<UserEntity> getUser() {
    System.out.println("getting users");
    return this.userSerivce.getAllUsers();
  }

  @GetMapping("/hello")
  public String hello() {
    return "Hello World";
  }

  @GetMapping("/current-user")
  public String getLoggedInUser(Principal principal) {
    return principal.getName();
  }
}
