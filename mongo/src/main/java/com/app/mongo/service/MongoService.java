package com.app.mongo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.mongo.model.Person;
import com.app.mongo.repository.MongoDBRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MongoService {

	@Autowired
	private MongoDBRepository repo;
	
	public void create(Person person) {
		repo.save(person);
	}
}
