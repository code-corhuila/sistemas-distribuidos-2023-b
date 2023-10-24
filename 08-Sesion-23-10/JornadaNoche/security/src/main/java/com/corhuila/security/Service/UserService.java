package com.corhuila.security.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.security.Entity.User;
import com.corhuila.security.IRepository.IBaseRepository;
import com.corhuila.security.IRepository.IUserRepository;
import com.corhuila.security.IService.IUserService;

@Service
public class UserService extends BaseService<User> implements IUserService {
	
	@Override
	protected IBaseRepository<User, Long> getRepository() {
		return repository;
	}

	@Autowired
	private IUserRepository repository;
}
