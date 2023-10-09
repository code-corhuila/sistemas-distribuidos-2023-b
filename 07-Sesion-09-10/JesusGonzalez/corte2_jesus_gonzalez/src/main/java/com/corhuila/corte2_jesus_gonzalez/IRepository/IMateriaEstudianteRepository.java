package com.corhuila.corte2_jesus_gonzalez.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.corhuila.corte2_jesus_gonzalez.Entity.MateriaEstudiante;
@Repository
public interface IMateriaEstudianteRepository extends JpaRepository<MateriaEstudiante, Long>{

}
