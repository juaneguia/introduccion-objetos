package ejercicio2;

public class Tarea {

	private String decipcion;
	private String estado;
	
	public Tarea(String decipcion, String estado) {
		this.decipcion = decipcion;
		this.estado = estado;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDecipcion() {
		return decipcion;
	}

	@Override
	public String toString() {
		return "Tarea: Decipcion:" + decipcion + ", Estado:" + estado;
	}
	
	
}
