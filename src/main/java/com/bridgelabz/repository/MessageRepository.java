package com.bridgelabz.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.model.Message;

public interface MessageRepository extends CrudRepository<Message, Integer>{
	
}
