package com.app.mongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.mongo.model.Person;
import com.app.mongo.service.MongoService;

@RestController
public class MongoController {

	@Autowired
	private MongoService service;
	
	@PostMapping("/insert")
	public void create(@RequestBody Person person) {
		service.create(person);
	}
}
