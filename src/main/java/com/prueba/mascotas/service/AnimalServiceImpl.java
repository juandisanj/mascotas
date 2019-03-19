package com.prueba.mascotas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.mascotas.dao.AnimalRepository;
import com.prueba.mascotas.entity.Animal;

@Service
public class AnimalServiceImpl implements AnimalService {

	@Autowired
	private AnimalRepository animalRepository;
	
	@Override
	public Animal findAnimal(int id) {
		return animalRepository.findAnimal(id);
	}

	@Override
	public List<Animal> findAll() {
		return animalRepository.findAll();
	}

	@Override
	public List<Animal> findByStatus(String status) {
		return animalRepository.findByStatus(status);
	}
	
}
