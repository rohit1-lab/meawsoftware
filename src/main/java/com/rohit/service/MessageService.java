package com.rohit.service;

import java.util.List;

import com.rohit.exception.ChatException;
import com.rohit.exception.ProjectException;
import com.rohit.exception.UserException;
import com.rohit.model.Message;

public interface MessageService {

    Message sendMessage(Long senderId, Long chatId, String content) throws UserException, ChatException, ProjectException;

    List<Message> getMessagesByProjectId(Long projectId) throws ProjectException, ChatException;
}

