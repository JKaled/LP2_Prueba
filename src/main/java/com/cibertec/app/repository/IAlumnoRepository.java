package com.cibertec.app.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.app.models.Alumno;

@Repository
public interface IAlumnoRepository extends CrudRepository<Alumno, Long>  {
	
	
	
	
		
	
}
