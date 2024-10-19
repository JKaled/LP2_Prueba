package com.cibertec.app.service;

import com.cibertec.app.models.Empleado;

import java.util.*;

public interface IEmpleadoService {
	
	Empleado guardar(Empleado objEmpleado);
	void eliminar(Long codigo);
	Empleado editar(Empleado objEmpleado);
	
	
	
	List<Empleado> listarTodo();
	Empleado consultarXId(Long codigo);
	
	
	
	

}
