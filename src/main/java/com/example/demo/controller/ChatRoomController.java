package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ChatRoom;
import com.example.demo.service.ChatRoomService;

@RestController
public class ChatRoomController {

    private final ChatRoomService chatRoomService;

    public ChatRoomController(ChatRoomService chatRoomService) {
        this.chatRoomService = chatRoomService;
    }

    @GetMapping("/chatrooms")
    public List<ChatRoom> getAllChatRooms() {
        return chatRoomService.findAllChatRooms();
    }

    @GetMapping("/chatrooms/{id}")
    public ChatRoom getChatRoom(@PathVariable Long id) {
        return chatRoomService.findChatRoomById(id);
    }

    @PostMapping("/chatrooms")
    public ChatRoom createChatRoom(@RequestParam String name) {
        return chatRoomService.createChatRoom(name);
    }
}
