package com.prueba.mascotas.entity;

import java.util.Date;

import javax.persistence.Entity;

// @Entity(name = "Perro")
public class Perro extends Animal {

	private static final long serialVersionUID = 1L;
	
	public Perro() {
		super();
		this.setDescripcion(descripcion());
	}
	
	public Perro(int codigo, String nombre, Estado estado, Date nacimiento, int visitas, Propietario propietario) {
		super(codigo, nombre, estado, nacimiento, visitas, propietario);
		this.setDescripcion(descripcion());
	}

	@Override
	public String descripcion() {
		String descripcion = "Canis lupus familiaris";
		return descripcion;
	}

}
