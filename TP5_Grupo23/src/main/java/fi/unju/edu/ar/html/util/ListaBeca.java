package fi.unju.edu.ar.html.util;

import java.time.LocalDate;
import java.util.ArrayList;

import fi.unju.edu.ar.model.Beca;
import fi.unju.edu.ar.model.Curso;
import fi.unju.edu.ar.model.Docente;

public class ListaBeca {
	
	private ArrayList<Beca> becas;
	
	
	public ListaBeca() {
		becas = new ArrayList<Beca>();
		
		Docente docente1 = new Docente(100,"María","Diaz","mdiaz@mail.com.ar","388999999");
		Docente docente2 = new Docente(101,"Pedro","Ramirez","pramirez@mail.com.ar","388888888");
		Docente docente3 = new Docente(102,"Andrea","Luna","aluna@mail.com.ar","388777777");
		
		Curso curso1 = new Curso(1,"Inglés Inicial", LocalDate.of(2022, 05, 15),LocalDate.of(2022, 8,15),100,"Virtual",docente1,"idioma");
		Curso curso2= new Curso(1,"Php", LocalDate.of(2022, 06, 20),LocalDate.of(2022, 10,15),150,"Virtual",docente2,"desarrollo");
		Curso curso3= new Curso(1,"Inglés Inicial", LocalDate.of(2022, 05, 20),LocalDate.of(2022, 12,20),200,"Virtual",docente3,"desarrollo");
				
		becas.add(new Beca(1, curso1,LocalDate.of(2022, 5, 4),LocalDate.of(2022, 5, 9)));
		becas.add(new Beca(2, curso2,LocalDate.of(2022, 6, 1),LocalDate.of(2022, 6, 10)));
		becas.add(new Beca(3, curso3,LocalDate.of(2022, 5, 3),LocalDate.of(2022, 5, 10)));
	}

	/*métodos accesores*/
	public ArrayList<Beca> getBecas() {
		return becas;
	}


	public void setBecas(ArrayList<Beca> becas) {
		this.becas = becas;
	}
	
	

}
