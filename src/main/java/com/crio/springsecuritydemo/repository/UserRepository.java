package com.crio.springsecuritydemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.crio.springsecuritydemo.model.User;

public interface UserRepository extends MongoRepository<User, String> {

    User findByEmail(String email);

}
