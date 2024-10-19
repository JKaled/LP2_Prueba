package com.cibertec.app.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="mascotas")
public class Mascotas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_mascota;
	@Column(name = "nombre", length = 40, nullable = false)
	private String nombre;
	@Column(name = "raza", length = 40, nullable = false)
	private String raza;
	@Column(name = "genero", length = 40, nullable = false)
	private String genero;
	@Column(name = "cedula", length = 40, nullable = false)
	private Integer cedula;


	public Mascotas() {
	
	}


	public Mascotas(Integer id_mascota, String nombre, String raza, String genero, Integer cedula) {
		super();
		this.id_mascota = id_mascota;
		this.nombre = nombre;
		this.raza = raza;
		this.genero = genero;
		this.cedula = cedula;
	}


	public Integer getId_mascota() {
		return id_mascota;
	}


	public void setId_mascota(Integer id_mascota) {
		this.id_mascota = id_mascota;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public Integer getCedula() {
		return cedula;
	}


	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}
}