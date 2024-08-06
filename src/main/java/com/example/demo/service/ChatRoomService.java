package com.example.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.model.ChatRoom;

@Service
public class ChatRoomService {
    private final Map<Long, ChatRoom> chatRooms = new HashMap<>();
    private long nextId = 1;

    public ChatRoomService() {
        // 애플리케이션 시작 시 기본 채팅방 하나 생성
        createChatRoom("Default Chat Room");
    }

    public ChatRoom createChatRoom(String name) {
        ChatRoom chatRoom = new ChatRoom();
        chatRoom.setId(nextId++);
        chatRoom.setName(name);
        chatRooms.put(chatRoom.getId(), chatRoom);
        return chatRoom;
    }

    public List<ChatRoom> findAllChatRooms() {
        return new ArrayList<>(chatRooms.values());
    }

    public ChatRoom findChatRoomById(Long id) {
        return chatRooms.get(id);
    }
}
