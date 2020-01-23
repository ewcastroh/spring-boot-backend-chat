package com.ewch.springboot.backend.chat.models.service;

import com.ewch.springboot.backend.chat.models.documents.Message;

import java.util.List;

public interface ChatService {

    public List<Message> findFirst10ByOrderByDateDesc();

    public Message save(Message message);
}
