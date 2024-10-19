package com.cibertec.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.app.models.Empleado;
import com.cibertec.app.repository.IEmpleadoRepository;



@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	IEmpleadoRepository repositorioEmpleado;
	

	@Override
	public Empleado guardar(Empleado objEmpleado) {
		return repositorioEmpleado.save(objEmpleado);
	}

	@Override
	public void eliminar(Long codigo) {
		repositorioEmpleado.deleteById(codigo);
	}

	@Override
	public Empleado editar(Empleado objEmpleado) {
		return repositorioEmpleado.save(objEmpleado);
	}

	@Override
	public List<Empleado> listarTodo() {
		return (List<Empleado>) repositorioEmpleado.findAll();
	}

	@Override
	public Empleado consultarXId(Long codigo) {
		return repositorioEmpleado.findById(codigo).orElse(null);
	}

}
