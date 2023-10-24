package com.corhuila.security.IRepository;

import org.springframework.stereotype.Repository;

import com.corhuila.security.Entity.Person;
@Repository
public interface IPersonRepository extends IBaseRepository<Person, Long>{
}
