package com.corhuila.securitymongo.IService;

import java.util.List;

import com.corhuila.securitymongo.Entity.User;

public interface IUserService{
	List<User> all();
    List<User> findByStateTrue();
    User findById(String id) throws Exception;
    User save(User entity) throws Exception;
    void update(String id, User entity) throws Exception;
    void delete(String id) throws Exception;
}
