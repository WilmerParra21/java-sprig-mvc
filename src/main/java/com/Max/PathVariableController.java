package com.Max;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/path")
public class PathVariableController {

@GetMapping("/variable/{texto}")

public String variablepath(@PathVariable String texto, Model mol){
	mol.addAttribute("titulo","Recibir parámetros atraves de la URL con PathVariable");
	
	mol.addAttribute("enviados", "Que buen flamework es Spring"+texto);
	return "variable/ver";
}
	
	
}
