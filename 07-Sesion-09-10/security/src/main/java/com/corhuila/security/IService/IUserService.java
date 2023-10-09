package com.corhuila.security.IService;

import java.util.List;
import java.util.Optional;

import com.corhuila.security.Entity.User;

public interface IUserService {
	
	List<User> all();
    
    Optional<User> findById(Long id);
    
    User save(User user);
    
    void update(User user, Long id);
    
    void delete(Long id);
}
