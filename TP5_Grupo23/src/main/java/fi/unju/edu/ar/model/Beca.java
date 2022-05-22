package fi.unju.edu.ar.model;

import java.time.LocalDate;

public class Beca {
		private String fechaInicio;
		private String fechaFIn;
		private String curso;
		private int codigo;
		private boolean estado;
		
		public Beca(String fechaInicio, String fechaFIn, String curso, int codigo, boolean estado) {
			super();
			this.fechaInicio = fechaInicio;
			this.fechaFIn = fechaFIn;
			this.curso = curso;
			this.codigo = codigo;
			this.estado = estado;
		}

		public Beca(int i, Curso curso1, LocalDate of, LocalDate of2) {
			// TODO Auto-generated constructor stub
		}

		public String getFechaInicio() {
			return fechaInicio;
		}

		public void setFechaInicio(String fechaInicio) {
			this.fechaInicio = fechaInicio;
		}

		public String getFechaFIn() {
			return fechaFIn;
		}

		public void setFechaFIn(String fechaFIn) {
			this.fechaFIn = fechaFIn;
		}

		public String getCurso() {
			return curso;
		}

		public void setCurso(String curso) {
			this.curso = curso;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public boolean isEstado() {
			return estado;
		}

		public void setEstado(boolean estado) {
			this.estado = estado;
		}
		
		
}
