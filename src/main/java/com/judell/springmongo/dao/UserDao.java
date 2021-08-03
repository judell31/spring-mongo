package com.judell.springmongo.dao;

import com.judell.springmongo.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDao extends MongoRepository<Users, Integer> {
}
