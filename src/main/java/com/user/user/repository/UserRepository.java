package com.user.user.repository;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.query.MongoEntityInformation;
import org.springframework.data.mongodb.repository.support.MongoRepositoryFactory;
import org.springframework.data.mongodb.repository.support.SimpleMongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.user.user.model.User;
@Repository
public class UserRepository extends SimpleMongoRepository<User, Integer> {

	public UserRepository(MongoEntityInformation<User, Integer> metadata, MongoOperations mongoOperations) {
		super(metadata, mongoOperations);
		// TODO Auto-generated constructor stub
	}


}
