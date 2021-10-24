package com.bridgelabz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.model.Message;
import com.bridgelabz.repository.MessageRepository;

@Service
public class MessageService {

	// @Autowired
	// MessageRepository messageRepository;

	private MessageRepository messageRepository;

	@Autowired

	public MessageService(MessageRepository messageRespository) {
		this.messageRepository = messageRespository;
	}

	// To save a record in database we will use "save" method of Crud repository or
	// JPA Repository
	public void saveOrUpdate(Message message) {
		messageRepository.save(message);
	}

	// To get a record from db we will use getById method of Crud repository
	public Optional<Message> getMessageById(int messageId) {
		return messageRepository.findById(messageId);
	}

	// To delete the record from db we have deleteById() of CrudRepository
	public void deleteMessageById(int messageId) {
		messageRepository.deleteById(messageId);
	}

	// To update a record in db we use the save method of Crud
	public void updateMessage(Message message) {
		messageRepository.save(message);
	}

	// To get all records from db we use findByAll method of crud
	public List<Message> getAllMessages() {
		return (List<Message>) messageRepository.findAll();
	}
}
