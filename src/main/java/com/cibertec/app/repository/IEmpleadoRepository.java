package com.cibertec.app.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.cibertec.app.models.Empleado;

@Repository
public interface IEmpleadoRepository extends CrudRepository<Empleado, Long> {
	
}
