package com.prueba.mascotas.service;

import java.util.List;

import com.prueba.mascotas.entity.Gato;

public interface GatoService {
	
	public Gato save(Gato gato);
	
	public Gato find(int id);
	
	public List<Gato> getList();

}
