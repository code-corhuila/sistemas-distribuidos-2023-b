package com.corhuila.corte2_jesus_gonzalez.IService;

import java.util.List;
import java.util.Optional;

import com.corhuila.corte2_jesus_gonzalez.Entity.MateriaEstudiante;

public interface IMateriaEstudianteService {

	List<MateriaEstudiante> all();
    
    public Optional<MateriaEstudiante> findById(Long id);
    
    public MateriaEstudiante save(MateriaEstudiante materiaEstudiante);
    
    public void update(MateriaEstudiante materiaEstudiante, Long id);
    
    public void delete(Long id);
}
