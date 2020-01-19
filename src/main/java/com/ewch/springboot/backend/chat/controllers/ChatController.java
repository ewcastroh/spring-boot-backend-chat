package com.ewch.springboot.backend.chat.controllers;

import com.ewch.springboot.backend.chat.documents.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.Date;

@Controller
public class ChatController {

    @MessageMapping("/message")
    @SendTo("/chat/message")
    public Message receiveMessage(Message message) {
        message.setDate(new Date().getTime());
        message.setText("Received by Broker: " + message.getText());
        return message;
    }
}
