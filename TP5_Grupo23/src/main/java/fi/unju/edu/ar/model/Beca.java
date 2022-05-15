package fi.unju.edu.ar.model;

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
