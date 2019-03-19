package com.prueba.mascotas.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.prueba.mascotas.entity.Animal;
import com.prueba.mascotas.service.AnimalService;
import com.prueba.mascotas.service.EstadoService;

@Controller
public class IndexController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);
	
	public static final String VIEW_INDEX = "index";
	public static final String VIEW_MASCOTA = "details";
	
	@Autowired
	private AnimalService animalService;
	@Autowired
	private EstadoService estadoService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(Model model, HttpServletRequest request) {
		
		LOGGER.info("Url llamada: " + request.getRequestURL().toString());
		
		model.addAttribute("listaEstados", estadoService.findAll());
		model.addAttribute("listaMascotas", animalService.findAll());
	
		return VIEW_INDEX;
	}
	
	@PostMapping("/")
	public String index(@RequestParam("estado") String estado, Model model, HttpServletRequest request, RedirectView redirect) {
		
		LOGGER.info("Url llamada: " + request.getRequestURL().toString());
		
		if("todos".equals(estado)) {
			model.addAttribute("listaMascotas", animalService.findAll());
		}else {
			model.addAttribute("listaMascotas", animalService.findByStatus(estado));
		}
		model.addAttribute("listaEstados", estadoService.findAll());
		
		System.out.println("Filtro por estado: " + estado);
		for(Animal a : animalService.findByStatus(estado)) {
			System.out.println("Mascota: " + a.getNombre());
		}
		// return "redirect:/";
		return VIEW_INDEX;
	}
	
	@RequestMapping(value="/mascota/{id}", method=RequestMethod.GET)
	public String detais(@PathVariable("id") int id, Model model) {
		
		model.addAttribute("mascota", animalService.findAnimal(id));
		
		return VIEW_MASCOTA;
	}

}
