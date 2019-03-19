package com.prueba.mascotas.dao;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.prueba.mascotas.entity.Estado;

@Repository
public class EstadoRepositoryImpl implements EstadoRepository {

	@Override
	public List<String> findAll() {
		List<String> listaEstados = new ArrayList<>();
		
		for(Estado e : Estado.values()) {
			listaEstados.add(e.getEstado());
		}
		
		return listaEstados;
	}

}
