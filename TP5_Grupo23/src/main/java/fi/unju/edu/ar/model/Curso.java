package fi.unju.edu.ar.model;

import java.time.LocalDate;

public class Curso {
		private int codigo;
		private int horas;
		private String titulo;
		private String fechaInicio;
		private String fechaFin;
		private String modalidad;
		private String docente;
		
		public Curso(int codigo, int horas, String titulo, String fechaInicio, String fechaFin, String modalidad,
				String docente) {
			super();
			this.codigo = codigo;
			this.horas = horas;
			this.titulo = titulo;
			this.fechaInicio = fechaInicio;
			this.fechaFin = fechaFin;
			this.modalidad = modalidad;
			this.docente = docente;
		}
		public Curso(int i, String string, LocalDate of, LocalDate of2, int j, String string2, Docente docente1,
				String string3) {
			// TODO Auto-generated constructor stub
		}
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public int getHoras() {
			return horas;
		}
		public void setHoras(int horas) {
			this.horas = horas;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getFechaInicio() {
			return fechaInicio;
		}
		public void setFechaInicio(String fechaInicio) {
			this.fechaInicio = fechaInicio;
		}
		public String getFechaFin() {
			return fechaFin;
		}
		public void setFechaFin(String fechaFin) {
			this.fechaFin = fechaFin;
		}
		public String getModalidad() {
			return modalidad;
		}
		public void setModalidad(String modalidad) {
			this.modalidad = modalidad;
		}
		public String getDocente() {
			return docente;
		}
		public void setDocente(String docente) {
			this.docente = docente;
		}
		
		
}
