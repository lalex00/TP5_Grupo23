package fi.unju.edu.ar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	@GetMapping("/inicio")
	public String getIndexPage(Model model) {
		return "index";
	}
	
	@GetMapping("/agenda")
	public String getAgendaPage(Model model) {
		return "agenda";
	}
	
	@GetMapping("/contacto")
	public String getContactoPage(Model model) {
		return "contacto";
	}
	
}
