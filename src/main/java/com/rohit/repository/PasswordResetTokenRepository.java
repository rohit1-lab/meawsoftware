package com.rohit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohit.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
