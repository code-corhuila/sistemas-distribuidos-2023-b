package com.corhuila.securitymongo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.securitymongo.DTO.IUserDto;
import com.corhuila.securitymongo.Entity.User;
import com.corhuila.securitymongo.IRepository.IBaseRepository;
import com.corhuila.securitymongo.IRepository.IUserRepository;
import com.corhuila.securitymongo.IService.IUserService;

@Service
public class UserService extends BaseService<User> implements IUserService {
	
	@Override
	protected IBaseRepository<User, String> getRepository() {
		return repository;
	}

	@Autowired
	private IUserRepository repository;

	@Override
	public List<IUserDto> getListPersonUser() {
		return repository.getListPersonUser();
	}
	
	
	
}
