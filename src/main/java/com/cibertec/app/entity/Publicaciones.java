package com.cibertec.app.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="publicaciones")
public class Publicaciones {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_publicaciones;
	@Column(name ="titulo", length= 45, nullable = false)
	private String titulo;
	@Column(name ="cuerpo", length= 45, nullable = false)
	private String cuerpo;
	@Column(name ="usuarios_id", length= 45, nullable = false)
	private int usuarios_id;

	public Publicaciones() {
		
	}

	
	public Publicaciones(int id_publicaciones, String titulo, String cuerpo, int usuarios_id) {
		super();
		this.id_publicaciones = id_publicaciones;
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.usuarios_id = usuarios_id;
	}


	public int getId_publicaciones() {
		return id_publicaciones;
	}

	public void setId_publicaciones(int id_publicaciones) {
		this.id_publicaciones = id_publicaciones;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public int getUsuarios_id() {
		return usuarios_id;
	}

	public void setUsuarios_id(int usuarios_id) {
		this.usuarios_id = usuarios_id;
	}
}
