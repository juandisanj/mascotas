package com.prueba.mascotas.service;

import java.util.List;

import com.prueba.mascotas.entity.Animal;

public interface AnimalService {
	
	public Animal findAnimal(int id);
	
	public List<Animal> findAll();
	
	public List<Animal> findByStatus(String status);

}
