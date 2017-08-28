package com.chandu.controller;

import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.chandu.model.Message;
import com.chandu.model.OutputMessage;

@Controller
public class ChatForumController {
	
	@MessageMapping("/chat_forum")        //send message
	@SendTo("/topic/message")       //Receive message
	public OutputMessage sendMessage(Message message){
		System.out.println("Calling the method sendMessage");
		System.out.println("Message: "+message.getMessage());
		
		
		return new OutputMessage(message,new Date());  //appending current date
		
}

}
