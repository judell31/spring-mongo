package com.judell.springmongo.dao;

import com.judell.springmongo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDao extends MongoRepository<User, Integer> {
}
