package com.prueba.model.entitys;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	private Boolean procesar;
	
	public User() {};

	public User(Long id, String nombre, String apellido, Boolean procesar) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.procesar = procesar;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Boolean getProcesar() {
		return procesar;
	}

	public void setProcesar(Boolean procesar) {
		this.procesar = procesar;
	}

}
