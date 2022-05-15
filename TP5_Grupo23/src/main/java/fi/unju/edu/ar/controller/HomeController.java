package fi.unju.edu.ar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	@GetMapping("/index.html")
	public String home() {
		return "index";
	}
	
	@GetMapping("/agenda.html")
	public String agenda() {
		return "agenda";
	}
	
	@GetMapping("/beneficios.html")
	public String getBeneficios() {
		return "beneficios";
	}
	
	@GetMapping("/contacto.html")
	public String getContacto() {
		return "contacto";
	}
	
	@GetMapping("/nuevo_docente.html")
	public String nuevo_docente() {
		return "nuevo_docente";
	}
	
}
