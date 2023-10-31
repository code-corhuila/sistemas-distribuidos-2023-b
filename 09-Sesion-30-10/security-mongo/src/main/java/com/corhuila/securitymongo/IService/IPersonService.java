package com.corhuila.securitymongo.IService;

import java.util.List;

import com.corhuila.securitymongo.Entity.Person;

public interface IPersonService{

	List<Person> all();
    List<Person> findByStateTrue();
    Person findById(String id) throws Exception;
    Person save(Person entity) throws Exception;
    void update(String id, Person entity) throws Exception;
    void delete(String id) throws Exception;
}
