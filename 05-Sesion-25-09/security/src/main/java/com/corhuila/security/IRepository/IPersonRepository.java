package com.corhuila.security.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corhuila.security.Entity.Person;

public interface IPersonRepository extends JpaRepository<Person, Long>{
	//Aquí van las query nativas.
}
