package com.cibertec.app.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name="cliente")
public class Cliente {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo_cliente;
@Column(name="nombre", length=40 , nullable=true)
	private String nombre;
@Column(name="apellido_paterno", length=40 , nullable=true)
	private String apellido_paterno;
@Column(name="apellido_materno", length=40 , nullable=true)
	private String apellido_materno;
@Column(name="documento", length=40 , nullable=true)
	private String documento;
@ManyToOne
@JoinColumn(name="codigo_ciudad")
private Ciudad ciudad;
	
public Cliente() {
	
}

public Cliente(Integer codigo_cliente, String nombre, String apellido_paterno, String apellido_materno,
		String documento, Ciudad ciudad) {
	super();
	this.codigo_cliente = codigo_cliente;
	this.nombre = nombre;
	this.apellido_paterno = apellido_paterno;
	this.apellido_materno = apellido_materno;
	this.documento = documento;
	this.ciudad = ciudad;
}

public Integer getCodigo_cliente() {
	return codigo_cliente;
}

public void setCodigo_cliente(Integer codigo_cliente) {
	this.codigo_cliente = codigo_cliente;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido_paterno() {
	return apellido_paterno;
}

public void setApellido_paterno(String apellido_paterno) {
	this.apellido_paterno = apellido_paterno;
}

public String getApellido_materno() {
	return apellido_materno;
}

public void setApellido_materno(String apellido_materno) {
	this.apellido_materno = apellido_materno;
}

public String getDocumento() {
	return documento;
}

public void setDocumento(String documento) {
	this.documento = documento;
}

public Ciudad getCiudad() {
	return ciudad;
}

public void setCiudad(Ciudad ciudad) {
	this.ciudad = ciudad;
}
}

