package com.corhuila.security.IRepository;

import org.springframework.stereotype.Repository;

import com.corhuila.security.Entity.User;
@Repository
public interface IUserRepository extends IBaseRepository<User, Long>{
}
