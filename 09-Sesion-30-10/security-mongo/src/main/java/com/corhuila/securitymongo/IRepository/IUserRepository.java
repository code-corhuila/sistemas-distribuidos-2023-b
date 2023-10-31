package com.corhuila.securitymongo.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.corhuila.securitymongo.Entity.User;
@Repository
public interface IUserRepository extends MongoRepository<User, String>{	
	
}
