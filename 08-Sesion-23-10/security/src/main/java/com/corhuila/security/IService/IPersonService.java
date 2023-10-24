package com.corhuila.security.IService;

import java.util.List;
import java.util.Optional;

import com.corhuila.security.Entity.Person;

public interface IPersonService {
	
	List<Person> all();
    
    public Optional<Person> findById(Long id);
    
    public Person save(Person person);
    
    public void update(Person person, Long id);
    
    public void delete(Long id);
}
