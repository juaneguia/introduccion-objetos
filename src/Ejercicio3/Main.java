package Ejercicio3;

public class Main {

	public static void main(String[] args) {
		Cliente C1 = new Cliente("Rolo","Rolo@gmail.com" , 249401);
		Cliente C2 = new Cliente("Valen","Valentino@gmail.com" , 249402);
		Cliente C3 = new Cliente("Juan","Juanma@gmail.com" , 249403);
		System.out.println(C1);
		System.out.println(C2);
		System.out.println(C3);
		C1.setCorreo("Rolo1990@gmail.com");
		C2.setNombre("Valentino");
		C3.setNumtelefono(2494111);
		System.out.println(C1);
		System.out.println(C2);
		System.out.println(C3);
	}

}
