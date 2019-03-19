package com.prueba.mascotas.dao;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.prueba.mascotas.entity.Animal;
import com.prueba.mascotas.entity.Estado;
import com.prueba.mascotas.entity.Gato;
import com.prueba.mascotas.entity.Perro;
import com.prueba.mascotas.entity.Propietario;
import com.prueba.mascotas.utils.DateFormatter;

@Repository
public class AnimalRepository {
	
	Map<Integer, Animal> listaAnimales = new HashMap<>();
	
	public AnimalRepository() {
		listaAnimales = cargarDatos();
	}
	
	private Map<Integer, Animal> cargarDatos(){
		Map<Integer, Animal> lista = new HashMap<>();
		
		try {
			lista.put(1, new Gato(1, "Mircifu", Estado.ALTA, DateFormatter.addDate("12-12-2016"), 3, new Propietario(1, "Juan", "Rodriguez")));
			lista.put(2, new Gato(2, "Silvestre", Estado.ALTA, DateFormatter.addDate("14-12-2016"), 3, new Propietario(1, "Jose", "Rodriguez")));
			lista.put(3, new Gato(3, "Gato con botas", Estado.INGRESADO, DateFormatter.addDate("12-12-2016"), 3, new Propietario(1, "Martin", "Rodriguez")));
			lista.put(4, new Gato(4, "Rufo", Estado.ALTA, DateFormatter.addDate("12-12-2016"), 3, new Propietario(1, "Isaias", "Rodriguez")));
			lista.put(5, new Perro(5, "Roy", Estado.INGRESADO, DateFormatter.addDate("12-12-2016"), 3, new Propietario(1, "Marcos", "Rodriguez")));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	public Animal findAnimal(int id) {
		return listaAnimales.get(id);
	}
	
	public List<Animal> findAll(){
		List<Animal> lista = new ArrayList<>(listaAnimales.values());
		return lista;
	}
	
	public List<Animal> findByStatus(String status){
		List<Animal> lista = new ArrayList<>();
		Iterator<Map.Entry<Integer, Animal>> animal = listaAnimales.entrySet().iterator();
		while(animal.hasNext()) {
			Animal a = animal.next().getValue();
			if(status.contentEquals(a.getEstado().getEstado())) {
				lista.add(a);
			}
		}
		return lista;
	}

}
