package com.Max;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Models.Estudiante;

@Controller
@RequestMapping("/tareas")
public class ControladorTareas {

@GetMapping("/operacion/")
	public String Operacion(@RequestParam (name = "numero", required = false, defaultValue = "0") float numero, @RequestParam (name = "numero2", required = false, defaultValue = "0") float numero2,  Model molds){
	
	float sum = numero + numero2;
	float resta = numero - numero2;
	float mult = numero * numero2;
	float div = numero / numero2;
	
	molds.addAttribute("Operacion1","Suma: "+ sum);
	molds.addAttribute("Operacion2","Resta: "+ resta);
	molds.addAttribute("Operacion3","Multiplicación: "+ mult);
	molds.addAttribute("Operacion4","División:"+ div);
	
	return "/operacion/num";
}

@GetMapping("edad/{e}")
	public String Edades(@PathVariable int e, Model mol){
	String s;
	if(e<18) {
		s = "Es menor de edad";
	} else{
		s = "Es mayor de edad";
	}
	
	mol.addAttribute("persona",s +" y su Edad es "+ e);
	
	return "edades";
}
@GetMapping("estudiante")
public String listado(Model model) {
	model.addAttribute("title", "Listado de estudiantes");
	return "BD";
}
@ModelAttribute("estudiante")
public List <Estudiante> Estudiantes(){
	List<Estudiante> list = new ArrayList<Estudiante>();
	list.add(new Estudiante(2, 19, "Wilmer", "Parra", "Acacias"));
	list.add(new Estudiante(3, 20, "Leonardo", "Bolivar", "San José"));
	list.add(new Estudiante(4, 19, "Luis", "Blanco", "Piñonal"));
	
	 return list;
}

@GetMapping("/formula")
	public String TrianguloRectangulo(@RequestParam (name = "a", required = false, defaultValue = "0") double a, @RequestParam (name = "b", required = false, defaultValue = "0") double b, Model number) {
	
	double c = Math.sqrt(a * a + b * b);
	number.addAttribute("variable", "A = "+a+" y B = "+b);
	number.addAttribute("resultado", "La hipotenusa es: "+c);
	
	return "operacion/TrianguloRectangulo";
}
}





