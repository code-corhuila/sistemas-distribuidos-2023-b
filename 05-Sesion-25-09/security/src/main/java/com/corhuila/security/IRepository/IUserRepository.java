package com.corhuila.security.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corhuila.security.Entity.User;

public interface IUserRepository extends JpaRepository<User, Long>{
	//Aquí van las query nativas.
}
