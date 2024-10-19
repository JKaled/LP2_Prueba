package com.cibertec.app.entity;

public class Estudiante {
	
	private String codigoEstudiante;
	private String nombre;
	private String apellido;
	private String carrera;
	private String ciclo;
	private String curso;
	
	
	public Estudiante() {
		
	}

	public Estudiante(String codigoEstudiante, String nombre, String apellido, String carrera, String ciclo,
			String curso) {
		super();
		this.codigoEstudiante = codigoEstudiante;
		this.nombre = nombre;
		this.apellido = apellido;
		this.carrera = carrera;
		this.ciclo = ciclo;
		this.curso = curso;
	}

	public String getCodigoEstudiante() {
		return codigoEstudiante;
	}

	public void setCodigoEstudiante(String codigoEstudiante) {
		this.codigoEstudiante = codigoEstudiante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	
	

}
