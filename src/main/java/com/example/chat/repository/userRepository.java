package com.example.chat.repository;

import com.example.chat.model.user;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends MongoRepository<user,String> {
    
}
