package com.prueba.mascotas.entity;

public enum Estado {
	
	INGRESADO("Ingresado"),
	ALTA("Alta");
	
	private String estado;
	
	Estado(String estado) {
		this.estado = estado;
	}
	
	public String getEstado() {
		return estado;
	}

}
