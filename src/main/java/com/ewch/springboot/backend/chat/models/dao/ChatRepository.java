package com.ewch.springboot.backend.chat.models.dao;

import com.ewch.springboot.backend.chat.models.documents.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatRepository extends MongoRepository<Message, String> {

    public List<Message> findFirst10ByOrderByDateDesc();
}
