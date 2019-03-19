package com.prueba.mascotas.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AnimalServiceTest {
	
	@Autowired
	private AnimalService animalService;

	@Test
	public void testFindAnimal() {
			
		assertTrue(animalService.findAnimal(1).getNombre().equals("Mircifu"));
	}

	@Test
	public void testFindAll() {
		assertTrue(animalService.findAll().size() == 5);
	}

	@Test
	public void testFindByStatus() {
		assertTrue(true);
	}

}
