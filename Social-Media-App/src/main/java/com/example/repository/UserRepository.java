package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.User;


@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
	
	public Optional<User> findByEmail(String email);
}
