package com.corhuila.corte2_jesus_gonzalez.IService;

import java.util.List;
import java.util.Optional;

import com.corhuila.corte2_jesus_gonzalez.Entity.Estudiante;


public interface IEstudianteService {

	List<Estudiante> all();
    
    public Optional<Estudiante> findById(Long id);
    
    public Estudiante save(Estudiante estudiante);
    
    public void update(Estudiante estudiante, Long id);
    
    public void delete(Long id);
}
