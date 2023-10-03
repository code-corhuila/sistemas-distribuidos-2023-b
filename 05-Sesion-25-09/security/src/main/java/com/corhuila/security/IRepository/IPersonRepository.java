package com.corhuila.security.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.corhuila.security.Entity.Person;
@Repository
public interface IPersonRepository extends JpaRepository<Person, Long>{
	//Aquí van las query nativas.
}
