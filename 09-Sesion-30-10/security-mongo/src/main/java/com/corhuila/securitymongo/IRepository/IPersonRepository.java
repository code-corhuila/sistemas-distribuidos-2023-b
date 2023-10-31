package com.corhuila.securitymongo.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.corhuila.securitymongo.Entity.Person;
@Repository
public interface IPersonRepository extends MongoRepository<Person, String>{
}
