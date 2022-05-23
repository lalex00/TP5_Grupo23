package fi.unju.edu.ar.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fi.unju.edu.ar.model.Docente;
import fi.unju.edu.ar.html.util.ListaDocente;

@Controller
@RequestMapping("/docente")
public class DocenteController {
	
	@GetMapping("/nuevo")
	public String getFormNuevoAlumnnoPage(Model model) {
		model.addAttribute("docente", new Docente());
		return "nuevo_docente";
	}
		
	@GetMapping("/listaDocentes")
	public ModelAndView getListadoDocentesPage() {
		ModelAndView mav = new ModelAndView("lista_docentes");
		ListaDocente listaDocentes = new ListaDocente();
		mav.addObject("docentes", listaDocentes.getDocentes());
		return mav;
	}
	
	@PostMapping("/guardar")
	public ModelAndView getListadoDocentesPage(@ModelAttribute("docente")Docente docente) {
		ModelAndView mav = new ModelAndView("lista_docentes");
		// creo un objeto de la clase ListaAlumno, donde está el arrayList
		ListaDocente listaDocentes= new ListaDocente();
		//recupero el arrayList y agrego un objeto alumno a lista
		if(listaDocentes.getDocentes().add(docente)) {
//			LOGGER.info("Se agregó un objeto al arrayList de alumnos");
		}
		//enviar el arrayList de alumnos a la página lista_alumnos
		mav.addObject("docentes", listaDocentes.getDocentes());
		return mav;
	}

}
