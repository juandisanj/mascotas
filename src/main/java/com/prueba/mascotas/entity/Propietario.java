package com.prueba.mascotas.entity;

import java.io.Serializable;

public class Propietario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nombre;
	private String apellidos;
	
	public Propietario() {
	}

	public Propietario(int id, String nombre, String apellidos) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "Propietario [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	

}
