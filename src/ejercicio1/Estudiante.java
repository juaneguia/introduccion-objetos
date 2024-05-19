package ejercicio1;

public class Estudiante {

	private String nombre;
	private int edad;
	private int calificacion;
	
	//Constructor
	public Estudiante(String nombre, int edad, int calificacion) { //Click derecho -> Source -> Generate Contructor using fields
		this.nombre = nombre;
		this.edad = edad;
		this.calificacion = calificacion;
	}
	
	
	//EMPIEZA GETTER Y SETTER
	
	//Click derecho -> Source -> Generate getter/setters
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCalificacion() {
		return calificacion;
	}
	
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public String getNombre() {
		return nombre;
	}
	
	//FIN GETTER Y SETTER

	@Override
	public String toString() { //Click derecho -> Source -> Generate toString
		return "Estudiante de nombre: " + nombre + ", edad= " + edad + ", tuvo la calificacion de= " + calificacion;
	}
	
	
}
