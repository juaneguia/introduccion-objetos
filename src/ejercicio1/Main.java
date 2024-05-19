package ejercicio1;

public class Main {

	public static void main(String[] args) {
		
		Estudiante e1 = new Estudiante("Rolo", 26, 2);
		Estudiante e2 = new Estudiante("Juanma", 29, 10);
		Estudiante e3 = new Estudiante("Valen", 19, 8);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		e1.setEdad(22);
		e1.setCalificacion(7);
		System.out.println(e1);

	}

}
