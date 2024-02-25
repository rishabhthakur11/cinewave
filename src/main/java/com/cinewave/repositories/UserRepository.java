package com.cinewave.repositories;

import com.cinewave.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
  public UserEntity findByEmail(String email);
}
