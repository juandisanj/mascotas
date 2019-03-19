package com.prueba.mascotas.entity;

import java.util.Date;

import javax.persistence.Entity;

// @Entity(name="Gato")
public class Gato extends Animal {
	
	private static final long serialVersionUID = 1L;
	
	public Gato() {
		super();
		this.setDescripcion(descripcion());
	}
	
	public Gato(int codigo, String nombre, Estado estado, Date nacimiento, int visitas, Propietario propietario) {
		super(codigo, nombre, estado, nacimiento, visitas, propietario);
		this.setDescripcion(descripcion());
	}

	public String descripcion() {
		String descripcion = "Felis silvestris catus";
		return descripcion;
	}

}
