package com.rohit.service;

import java.util.List;

import com.rohit.exception.ChatException;
import com.rohit.exception.ProjectException;
import com.rohit.model.Chat;

public interface ChatService {

	Chat createChat(Chat chat) ;

	//Chat getChatsByProjectId(Long projectId) throws ChatException, ProjectException;

//	Chat addUsersToChat(Long chatId, List<Long> userIds) throws ChatException;

	
//	 List<Chat> searchChatsByName(String name) throws ChatException;

	// Other methods as needed
}
