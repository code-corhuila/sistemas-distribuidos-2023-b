package com.corhuila.securitymongo.IRepository;

import org.springframework.stereotype.Repository;

import com.corhuila.securitymongo.Entity.Person;
@Repository
public interface IPersonRepository extends IBaseRepository<Person, String>{
}
