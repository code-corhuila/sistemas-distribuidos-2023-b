package com.corhuila.corte2_jesus_gonzalez.Controller;

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

import com.corhuila.corte2_jesus_gonzalez.Entity.MateriaEstudiante;
import com.corhuila.corte2_jesus_gonzalez.IService.IMateriaEstudianteService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/MateriaEstudiante")
public class MateriaEstudianteController {

	@Autowired
	private IMateriaEstudianteService service;
	
	@GetMapping()
    public List<MateriaEstudiante> all() {
        return service.all();
    }
    
	@GetMapping("{id}")
    public Optional<MateriaEstudiante> show(@PathVariable Long id) {
        return service.findById(id);
    }
	
	@PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public MateriaEstudiante save(@RequestBody MateriaEstudiante materiaEstudiante) {
        return service.save(materiaEstudiante);
    }
	
	@PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void update(@RequestBody MateriaEstudiante materiaEstudiante, @PathVariable Long id) {
        service.update(materiaEstudiante, id);
    }
	
	@DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
    
}
