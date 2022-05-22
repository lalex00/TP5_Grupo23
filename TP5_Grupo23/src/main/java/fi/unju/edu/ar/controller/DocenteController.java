package fi.unju.edu.ar.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import fi.unju.edu.ar.html.util.ListaDocente;

@Controller
@RequestMapping("/docente")
public class DocenteController {
		
	@GetMapping("/listaDocentes")
	public ModelAndView getListadoDocentesPage() {
		ModelAndView mav = new ModelAndView("lista_docentes");
		ListaDocente listaDocentes = new ListaDocente();
		mav.addObject("docentes", listaDocentes.getDocentes());
		return mav;
	}

}
