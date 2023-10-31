package com.corhuila.securitymongo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.securitymongo.Entity.Person;
import com.corhuila.securitymongo.IRepository.IBaseRepository;
import com.corhuila.securitymongo.IRepository.IPersonRepository;
import com.corhuila.securitymongo.IService.IPersonService;

@Service
public class PersonService extends BaseService<Person> implements IPersonService {
	
	@Override
	protected IBaseRepository<Person, String> getRepository() {
		return repository;
	}

	@Autowired
	private IPersonRepository repository;
}
