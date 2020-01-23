package com.ewch.springboot.backend.chat.models.service;

import com.ewch.springboot.backend.chat.models.dao.ChatRepository;
import com.ewch.springboot.backend.chat.models.documents.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatServiceImpl implements ChatService {

    @Autowired
    private ChatRepository chatRepository;

    @Override
    public List<Message> findFirst10ByOrderByDateDesc() {
        return chatRepository.findFirst10ByOrderByDateDesc();
    }

    @Override
    public Message save(Message message) {
        return chatRepository.save(message);
    }
}
