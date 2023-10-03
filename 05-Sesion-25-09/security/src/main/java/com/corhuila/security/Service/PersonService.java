package com.corhuila.security.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.security.Entity.Person;
import com.corhuila.security.IRepository.IPersonRepository;
import com.corhuila.security.IService.IPersonService;

@Service
public class PersonService implements IPersonService {

	@Autowired
	private IPersonRepository iPersonRepository;
	
	@Override
	public List<Person> all() {
		return iPersonRepository.findAll();
	}

	@Override
	public Optional<Person> findById(Long id) {
		return iPersonRepository.findById(id);
	}

	@Override
	public Person save(Person person) {
		return iPersonRepository.save(person);
	}

	@Override
	public void update(Person person, Long id) {
		//validar si existe.
		iPersonRepository.save(person);
		
		 Optional<Person> op = iPersonRepository.findById(id);

	        if(op.isEmpty()){
	            System.out.println("Dato no encontrado");
	        }else{
	            //Crear nuevo objeto que va a contener los datos que se van actualizar
	            Person personUpdate = op.get();
	            personUpdate.setName(person.getName());
	            personUpdate.setLastname(person.getLastname());
	            

	            //Actualizar el objeto
	            iPersonRepository.save(personUpdate);
	        }
		
	}

	@Override
	public void delete(Long id) {
		iPersonRepository.deleteById(id);
	}
}
