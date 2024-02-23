package com.cinewave.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinewave.model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>
{
	public Optional<UserEntity> findByEmail(String email);
}
