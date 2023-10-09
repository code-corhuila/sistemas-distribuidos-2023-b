package com.corhuila.corte2_jesus_gonzalez.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.corte2_jesus_gonzalez.Entity.MateriaEstudiante;
import com.corhuila.corte2_jesus_gonzalez.IRepository.IMateriaEstudianteRepository;
import com.corhuila.corte2_jesus_gonzalez.IService.IMateriaEstudianteService;

@Service
public class MateriaEstudianteService implements IMateriaEstudianteService {

	@Autowired
	private IMateriaEstudianteRepository iMateriaEstudianteRepository;
	
	@Override
	public List<MateriaEstudiante> all() {
		return iMateriaEstudianteRepository.findAll();
	}

	@Override
	public Optional<MateriaEstudiante> findById(Long id) {
		return iMateriaEstudianteRepository.findById(id);
	}

	@Override
	public MateriaEstudiante save(MateriaEstudiante materiaEstudiante) {
		return iMateriaEstudianteRepository.save(materiaEstudiante);
	}

	@Override
	public void update(MateriaEstudiante materiaEstudiante, Long id) {
		//validar si existe.
		
		 Optional<MateriaEstudiante> op = iMateriaEstudianteRepository.findById(id);

	        if(op.isEmpty()){
	            System.out.println("Dato no encontrado");
	        }else{
	            //Crear nuevo objeto que va a contener los datos que se van actualizar
	            MateriaEstudiante materiaEstudianteUpdate = op.get();
	            materiaEstudianteUpdate.setMateria(materiaEstudiante.getMateria());
	            materiaEstudianteUpdate.setEstudianteId(materiaEstudiante.getEstudianteId());
	            
	            //Actualizar el objeto
	            iMateriaEstudianteRepository.save(materiaEstudianteUpdate);
	        }
		
	}

	@Override
	public void delete(Long id) {
		iMateriaEstudianteRepository.deleteById(id);
	}
}
