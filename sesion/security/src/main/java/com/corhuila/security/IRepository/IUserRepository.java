package com.corhuila.security.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.corhuila.security.Entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long>{
	//Aquí van las query nativas.
}
