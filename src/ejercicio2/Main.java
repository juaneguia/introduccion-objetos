package ejercicio2;

public class Main {

	public static void main(String[] args) {
		Tarea T1 = new Tarea("Hacer ejercicio", "Completado");
		Tarea T2 = new Tarea("Sumar", "No completada");
		Tarea T3 = new Tarea("Comer", "Completado");
		System.out.println(T1);
		System.out.println(T2);
		System.out.println(T3);
		
		T2.setEstado("Completado");
		System.out.println(T2);
	}

}
