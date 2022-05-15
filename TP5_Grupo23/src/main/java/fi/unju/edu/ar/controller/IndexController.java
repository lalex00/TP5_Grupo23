package fi.unju.edu.ar.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fi.unju.edu.ar.model.Alumno;

@Controller
@RequestMapping("/pcfi")
public class IndexController {
	
	
	@GetMapping("/inicio")
	public String getIndexPage(Model model) {
		
		Alumno unAlumno = new Alumno("Eugenio", "Ramirez", "eugera@gmail.com");
		model.addAttribute("alumno",unAlumno);
		
		return "index"; //devuelve la página web index.html
	}

}
