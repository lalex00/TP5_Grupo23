package fi.unju.edu.ar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fi.unju.edu.ar.html.util.ListaBeca;

@Controller
public class BeneficioController {
	
	@GetMapping("/beneficio/becas")
	public String getBeneficiosPage(Model model) {
		ListaBeca listaBecas = new ListaBeca();
		model.addAttribute("becas", listaBecas.getBecas());
		return "beneficios";
	}

}
