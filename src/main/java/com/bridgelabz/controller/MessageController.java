package com.bridgelabz.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.model.Message;
import com.bridgelabz.service.MessageService;

@RestController
public class MessageController {

	/*
	 * GET - To retreive the data POST - To save the data PUT - Update the existing
	 * data DELETE - delete the data
	 */

	// API

	private MessageService messageService;

	@Autowired
	public MessageController(MessageService messageService) {
		this.messageService = messageService;
	}

	// @Autowired
	// MessageService messageService;

	@PostMapping("/saveMessage")
	public void saveMessage(@RequestBody Message message) {
		messageService.saveOrUpdate(message);
	}

	@DeleteMapping("/deleteMessagte")
	public void deleteMessage(@RequestBody int messageId) {
		messageService.deleteMessageById(messageId);
	}

	@PutMapping("/updateMessage")
	public void updateMesssage(@RequestBody Message message) {
		messageService.updateMessage(message);
	}

	@GetMapping("/getMessage")
	public Optional<Message> getMessage(@RequestBody int messageId) {
		Optional<Message> result = messageService.getMessageById(messageId);
		return result;
	}

	public List<Message> getAllMessages() {
		return messageService.getAllMessages();
	}
}
