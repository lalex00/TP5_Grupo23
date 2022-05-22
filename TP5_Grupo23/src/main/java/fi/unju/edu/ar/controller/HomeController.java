package fi.unju.edu.ar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	@GetMapping(path = "/index")
	public String home() {
		return "index";
	}
	
	@GetMapping("/agenda")
	public String agenda() {
		return "agenda";
	}
	

	@GetMapping("/beneficios")
	public String beneficio() {
		return "beneficios";
	}
	
	@GetMapping("/contacto")
	public String contacto() {
		return "contacto";
	}
	
	@GetMapping("/idiomas")
	public String idiomas() {
		return "idiomas";
	}
	
	@GetMapping("/lista_alumnos")
	public String alumnos() {
		return "lista_alumnos";
	}

	@GetMapping("/beneficios.html")
	public String getBeneficios() {
		return "beneficios";
	}
	
	@GetMapping("/contacto.html")
	public String getContacto() {
		return "contacto";
	}
	
	@GetMapping("/lista_alumnos.html")
	public String getAlumnos() {
		return "lista_alumnos";
	}
	

	public String nuevo_docente() {
		return "nuevo_docente";
	}
	
}
