package com.corhuila.securitymongo.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.securitymongo.Entity.User;
import com.corhuila.securitymongo.IRepository.IUserRepository;

import com.corhuila.securitymongo.IService.IUserService;
@Service
public class UserService implements IUserService {
	
	
	@Autowired
	private IUserRepository repository;
	
	@Override
    public List<User> all() {
        return repository.findAll();
    }

    @Override
    public List<User> findByStateTrue() {
        return repository.findAll();
    }

	@Override
    public User findById(String id) throws Exception {
        Optional<User> op = repository.findById(id);

        if (op.isEmpty()) {
            throw new Exception("Registro no encontrado");
        }

        return op.get();
    }

    @Override
    public User save(User entity) throws Exception{
    	try {
            //entity.setCreatedAt(LocalDateTime.now());
            return repository.save(entity);
        } catch (Exception e) {
            // Captura la excepción
        	throw new Exception("Error al guardar la entidad: " + e.getMessage());
        }
    }

    @Override
    public void update(String id, User entity) throws Exception {
        Optional<User> op = repository.findById(id);

        if (op.isEmpty()) {
            throw new Exception("Registro no encontrado");
        }/*else if(op.get().getDeletedAt() != null) {
        	throw new Exception("Registro inhabilitado");
        }*/

        User entityUpdate = op.get();

        String[] ignoreProperties = {"id","createdAt","deleteAt"};
        BeanUtils.copyProperties(entity, entityUpdate,ignoreProperties);
        //entityUpdate.setUpdatedAt(LocalDateTime.now());
        repository.save(entityUpdate);
    }

    @Override
    public void delete(String id) throws Exception {
        Optional<User> op = repository.findById(id);

        if (op.isEmpty()) {
            throw new Exception("Registro no encontrado");
        }

        User entityUpdate = op.get();
        //entityUpdate.setDeletedAt(LocalDateTime.now());

        repository.save(entityUpdate);
    }
}
