package com.example.demo.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.example.demo.model.ChatMessage;

@Controller
public class ChatController {

    @MessageMapping("/chat.sendMessage") // Maps the /app/chat.sendMessage endpoint
    @SendTo("/topic/public") // Sends the message to /topic/public
    public ChatMessage sendMessage(ChatMessage message) {
        return message;
    }
}
