package com.corhuila.security.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.security.Entity.User;
import com.corhuila.security.IRepository.IUserRepository;
import com.corhuila.security.IService.IUserService;

@Service
public class UserService implements IUserService {

	@Autowired
	private IUserRepository iUserRepository;
	
	@Override
	public List<User> all() {
		return iUserRepository.findAll();
	}

	@Override
	public Optional<User> findById(Long id) {
		return iUserRepository.findById(id);
	}

	@Override
	public User save(User user) {
		return iUserRepository.save(user);
	}

	@Override
	public void update(User user, Long id) {
		//validar si existe.		
		
		 Optional<User> op = iUserRepository.findById(user.getId());

	        if(op.isEmpty()){
	            System.out.println("Dato no encontrado");
	        }else{
	            //Crear nuevo objeto que va a contener los datos que se van actualizar
	            User userUpdate = op.get();
	            userUpdate.setUser(user.getUser());
	            userUpdate.setPassword(user.getPassword());
	            userUpdate.setPersonId(user.getPersonId());
	            

	            //Actualizar el objeto
	            iUserRepository.save(userUpdate);
	        }
		
	}

	@Override
	public void delete(Long id) {
		iUserRepository.deleteById(id);
	}
}
