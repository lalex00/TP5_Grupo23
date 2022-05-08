package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

	@GetMapping
	public String home() {
		return "index";
	}
	
	@GetMapping("/agenda")
	public String agenda() {
		return "agenda";
	}
	
}
