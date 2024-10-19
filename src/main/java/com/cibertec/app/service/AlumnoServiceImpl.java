package com.cibertec.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.app.models.Alumno;
import com.cibertec.app.repository.IAlumnoRepository;


@Service
public class AlumnoServiceImpl implements IAlumnoService {
	
	@Autowired
	IAlumnoRepository repositorioAlumno;
	
	@Override
	public List<Alumno> listar() {
		return (List<Alumno>)repositorioAlumno.findAll();
	}

	@Override
	public Alumno consultarXId(Long id) {
		return repositorioAlumno.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Long id) {
		repositorioAlumno.deleteById(id);
	}

	@Override
	public Alumno editar(Alumno alu) {
		return repositorioAlumno.save(alu);
	}

	@Override
	public Alumno registrar(Alumno alu) {
		return repositorioAlumno.save(alu);
	}

}
