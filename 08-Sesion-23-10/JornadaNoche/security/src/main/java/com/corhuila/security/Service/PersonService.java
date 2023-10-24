package com.corhuila.security.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.security.Entity.Person;
import com.corhuila.security.IRepository.IBaseRepository;
import com.corhuila.security.IRepository.IPersonRepository;
import com.corhuila.security.IService.IPersonService;

@Service
public class PersonService extends BaseService<Person> implements IPersonService {
	
	@Override
	protected IBaseRepository<Person, Long> getRepository() {
		return repository;
	}

	@Autowired
	private IPersonRepository repository;
}
