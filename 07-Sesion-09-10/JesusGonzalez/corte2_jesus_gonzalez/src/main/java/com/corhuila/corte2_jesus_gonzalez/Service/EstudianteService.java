package com.corhuila.corte2_jesus_gonzalez.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.corte2_jesus_gonzalez.Entity.Estudiante;
import com.corhuila.corte2_jesus_gonzalez.IRepository.IEstudianteRepository;
import com.corhuila.corte2_jesus_gonzalez.IService.IEstudianteService;

@Service
public class EstudianteService implements IEstudianteService {

	@Autowired
	private IEstudianteRepository iEstudianteRepository;
	
	@Override
	public List<Estudiante> all() {
		return iEstudianteRepository.findAll();
	}

	@Override
	public Optional<Estudiante> findById(Long id) {
		return iEstudianteRepository.findById(id);
	}

	@Override
	public Estudiante save(Estudiante estudiante) {
		return iEstudianteRepository.save(estudiante);
	}

	@Override
	public void update(Estudiante estudiante, Long id) {
		//validar si existe.
		
		 Optional<Estudiante> op = iEstudianteRepository.findById(id);

	        if(op.isEmpty()){
	            System.out.println("Dato no encontrado");
	        }else{
	            //Crear nuevo objeto que va a contener los datos que se van actualizar
	            Estudiante estudianteUpdate = op.get();
	            estudianteUpdate.setNombre(estudiante.getNombre());
	            estudianteUpdate.setApellido(estudiante.getApellido());
	            estudianteUpdate.setEdad(estudiante.getEdad());
	            

	            //Actualizar el objeto
	            iEstudianteRepository.save(estudianteUpdate);
	        }
		
	}

	@Override
	public void delete(Long id) {
		iEstudianteRepository.deleteById(id);
	}
}
