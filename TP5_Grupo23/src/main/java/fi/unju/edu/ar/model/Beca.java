package fi.unju.edu.ar.model;

import java.time.LocalDate;

import fi.unju.edu.ar.model.Curso;

public class Beca {
	
	private int codigo;
	private Curso curso;
	private LocalDate fechaApertura;
	private LocalDate fechaCierre;
	private String estado;//completar...
	
	public Beca() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Beca(int codigo, Curso curso, LocalDate fechaApertura, LocalDate fechaCierre) {
		super();
		this.codigo = codigo;
		this.curso = curso;
		this.fechaApertura = fechaApertura;
		this.fechaCierre = fechaCierre;
	}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public LocalDate getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(LocalDate fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public LocalDate getFechaCierre() {
		return fechaCierre;
	}

	public void setFechaCierre(LocalDate fechaCierre) {
		this.fechaCierre = fechaCierre;
	}
	
	

}
