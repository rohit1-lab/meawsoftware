package com.rohit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohit.model.Chat;
import com.rohit.model.Project;

public interface ChatRepository extends JpaRepository<Chat, Long> {
    

	Chat findByProject(Project projectById);
	
//	List<Chat> findByProjectNameContainingIgnoreCase(String projectName);
}

