package fi.unju.edu.ar.model;

public class Alumno {
	private String nombres;
	private String apellido;
	private String eMail;
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Alumno(String nombres, String apellido, String eMail) {
		super();
		this.nombres = nombres;
		this.apellido = apellido;
		this.eMail = eMail;
	}



	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	

}
