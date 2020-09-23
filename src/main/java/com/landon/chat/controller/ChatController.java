package com.landon.chat.controller;

import com.landon.chat.model.ChatInMessage;
import com.landon.chat.model.ChatOutMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @author Mohammed Amr
 * @created 24/09/2020 - 00:25
 * @project 02_01-landon-stomp-chat-begin
 */

@Controller
public class ChatController {

    @MessageMapping("/guestchat")
    @SendTo("/topic/guestchats")
    public ChatOutMessage handleMessaging(ChatInMessage message) throws Exception {

        Thread.sleep(1000); // simulate delay

        return new ChatOutMessage(message.getMessage());
    }
}
