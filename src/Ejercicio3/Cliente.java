package Ejercicio3;

public class Cliente {
	private String nombre;
	private String correo;
	private long numtelefono;
	
	public Cliente(String nombre, String correo, long numtelefono) {
		this.nombre = nombre;
		this.correo = correo;
		this.numtelefono = numtelefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public long getNumtelefono() {
		return numtelefono;
	}

	public void setNumtelefono(int numtelefono) {
		this.numtelefono = numtelefono;
	}

	@Override
	public String toString() {
		return "Cliente Nombre: " + nombre + ", Correo: " + correo + ", Numero de telefono: " + numtelefono;
	}
	
	
}
