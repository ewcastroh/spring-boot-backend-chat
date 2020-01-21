package com.ewch.springboot.backend.chat.controllers;

import com.ewch.springboot.backend.chat.documents.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.Random;

@Controller
public class ChatController {

    private String[] colors = {"red", "green", "blue", "magenta", "purple", "orange", "pink"};

    @MessageMapping("/message")
    @SendTo("/chat/message")
    public Message receiveMessage(Message message) {
        message.setDate(new Date().getTime());
        if (message.getType().equals("NEW_USER")) {
            message.setColor(colors[new Random().nextInt(colors.length)]);
            message.setText("New user connected");
        } else {
            message.setText(message.getText());
        }
        return message;
    }
}
