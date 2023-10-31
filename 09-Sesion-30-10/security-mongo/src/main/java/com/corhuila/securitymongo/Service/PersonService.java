package com.corhuila.securitymongo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.securitymongo.Entity.Person;
import com.corhuila.securitymongo.IRepository.IPersonRepository;
import com.corhuila.securitymongo.IService.IPersonService;

@Service
public class PersonService implements IPersonService {
	
	
	@Autowired
	private IPersonRepository repository;
	
	@Override
    public List<Person> all() {
        return repository.findAll();
    }

    @Override
    public List<Person> findByStateTrue() {
        return repository.findAll();
    }

	@Override
    public Person findById(String id) throws Exception {
        Optional<Person> op = repository.findById(id);

        if (op.isEmpty()) {
            throw new Exception("Registro no encontrado");
        }

        return op.get();
    }

    @Override
    public Person save(Person entity) throws Exception{
    	try {
            //entity.setCreatedAt(LocalDateTime.now());
            return repository.save(entity);
        } catch (Exception e) {
            // Captura la excepción
        	throw new Exception("Error al guardar la entidad: " + e.getMessage());
        }
    }

    @Override
    public void update(String id, Person entity) throws Exception {
        Optional<Person> op = repository.findById(id);

        if (op.isEmpty()) {
            throw new Exception("Registro no encontrado");
        }/*else if(op.get().getDeletedAt() != null) {
        	throw new Exception("Registro inhabilitado");
        }*/

        Person entityUpdate = op.get();

        String[] ignoreProperties = {"id","createdAt","deleteAt"};
        BeanUtils.copyProperties(entity, entityUpdate,ignoreProperties);
        //entityUpdate.setUpdatedAt(LocalDateTime.now());
        repository.save(entityUpdate);
    }

    @Override
    public void delete(String id) throws Exception {
        Optional<Person> op = repository.findById(id);

        if (op.isEmpty()) {
            throw new Exception("Registro no encontrado");
        }

        Person entityUpdate = op.get();
        //entityUpdate.setDeletedAt(LocalDateTime.now());

        repository.save(entityUpdate);
    }
}
