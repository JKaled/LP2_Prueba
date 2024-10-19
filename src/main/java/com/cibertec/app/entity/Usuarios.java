package com.cibertec.app.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuarios {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer usuarios_id;
	
	@Column(name="nombre", length=45, nullable=false)
	private String nombre;
	
	@Column(name="contraseña", length=45, nullable=false)
	private String contraseña;

	public Usuarios() {
		
	}

	public Usuarios(Integer usuarios_id, String nombre, String contraseña) {
		super();
		this.usuarios_id = usuarios_id;
		this.nombre = nombre;
		this.contraseña = contraseña;
	}

	public Integer getUsuarios_id() {
		return usuarios_id;
	}

	public void setUsuarios_id(Integer usuarios_id) {
		this.usuarios_id = usuarios_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
}