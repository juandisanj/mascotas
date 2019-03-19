package com.prueba.mascotas.service;

import java.util.List;

import com.prueba.mascotas.entity.Perro;

public interface PerroService {

	public Perro save(Perro gato);

	public Perro find(int id);

	public List<Perro> getList();

}
