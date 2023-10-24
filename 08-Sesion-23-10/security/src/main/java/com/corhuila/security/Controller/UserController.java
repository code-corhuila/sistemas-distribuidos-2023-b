package com.corhuila.security.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.security.Entity.User;
import com.corhuila.security.IService.IUserService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/User")
public class UserController {

	@Autowired
	private IUserService service;
	
	@GetMapping()
    public List<User> all() {
        return service.all();
    }
    
	@GetMapping("{id}")
    public Optional<User> show(@PathVariable Long id) {
        return service.findById(id);
    }
	
	@PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public User save(@RequestBody User user) {
        return service.save(user);
    }
	
	@PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void update(@RequestBody User user, @PathVariable Long id) {
        service.update(user, id);
    }
	
	@DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
    
}
