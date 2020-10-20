package com.Max;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import Models.Persona;

@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping({"index", "/", "home"})
	
	public String index(Model model){
		model.addAttribute("titulo", "Hola Spring con Model!");
		return "index";
	}
	
	@GetMapping({"Perfil", "/", "inicio"})
public String perfil(Model mol){
	
	Persona object = new Persona();
	object.setNombre("Wilmer");
	object.setApellido("Parra");
	object.setCorreo("Programing21");
	mol.addAttribute("Atributo", object);
 return "Perfil";
}
	/*
	@GetMapping({"Listar", "/", "listado"})
	public String Listar(Model Mols) {
		
	List<Persona> Listad = new ArrayList<Persona>();
		
Listad.add(new Persona("Wilmer", "Parra", "Programing21@outlook.es"));
Listad.add(new Persona("Leonardo", "Bolivar", "Skarbo@gmail.com"));
			
    Mols.addAttribute("titulo", "Listado de Personas");
    Mols.addAttribute("personas", Listad);
		return "Listar";
	}
	*/
	
	@GetMapping("personas")
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de Persona");
		//model.addAttribute("personas", lista);
		return "Listar";
	}
	
	@ModelAttribute("personas")
	
	public List <Persona> PoblarPersonas(){
		List<Persona> lista = new ArrayList<Persona>();
		lista.add(new Persona("Wilmer", "Parra", "programing@outlook.es"));
		lista.add(new Persona("Leonardo", "Bolivar", "skar@gmail.com"));
		
		 return lista;
	}
}
