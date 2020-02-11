package com.app.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.mongo.model.Person;

public interface MongoDBRepository extends MongoRepository<Person, Long>{

}
