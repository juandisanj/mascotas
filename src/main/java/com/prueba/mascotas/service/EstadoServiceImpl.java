package com.prueba.mascotas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.mascotas.dao.EstadoRepository;

@Service
public class EstadoServiceImpl implements EstadoService {
	
	@Autowired
	private EstadoRepository estadoRepository;

	@Override
	public List<String> findAll() {
		return estadoRepository.findAll();
	}

}
