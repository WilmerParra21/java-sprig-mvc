package com.Max;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class Params {

@GetMapping("/")
	public String Index() {
		
		return "params/index";
	}

@GetMapping("/varios")
public String params(@RequestParam String Saludo,@RequestParam Integer numero, Model model) {
	model.addAttribute("enviados", "El Saludo enviado es: "+Saludo+" y el número enviado es: "+numero);
	
	return "params/ver";
}

@GetMapping("/param")
	public String Parametros(@RequestParam(name= "texto", required = false, defaultValue = "No hay Nada") String texto, Model mol) {
	mol.addAttribute("enviados", "El texto enviado es: "+texto);
	return "params/ver";
}


}
