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

import com.corhuila.security.Entity.Person;
import com.corhuila.security.IService.IPersonService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/Person")
public class PersonController {

	@Autowired
	private IPersonService service;
	
	@GetMapping()
    public List<Person> all() {
        return service.all();
    }
    
	@GetMapping("{id}")
    public Optional<Person> show(@PathVariable Long id) {
        return service.findById(id);
    }
	
	@PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Person save(@RequestBody Person person) {
        return service.save(person);
    }
	
	@PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void update(@RequestBody Person person, @PathVariable Long id) {
        service.update(person, id);
    }
	
	@DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
    
}
