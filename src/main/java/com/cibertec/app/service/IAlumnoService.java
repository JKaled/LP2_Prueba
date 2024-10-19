package com.cibertec.app.service;

import java.util.List;

import com.cibertec.app.models.Alumno;

public interface IAlumnoService {
	
	
	List<Alumno> listar();
	
	Alumno consultarXId(Long id);
	
	void eliminar(Long id);
	
	Alumno editar(Alumno alu);
	
	Alumno registrar(Alumno alu);
	


}
