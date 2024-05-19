package Ejercicio4;

public class Main {

	public static void main(String[] args) {
		Producto P1 = new Producto("Salchicas x6", 1300, 30);
		Producto P2 = new Producto("Coca Cola 2,25", 2230, 50);
		Producto P3 = new Producto("Yerba 1kg", 3500, 100);
		System.out.println(P1);
		System.out.println(P2);
		System.out.println(P3);
		P1.setPrecio(1200);
		P1.setCantDeStock(50);
		P2.setPrecio(2000);
		P3.setPrecio(3800);
		P3.setCantDeStock(8);
		System.out.println(P1);
		System.out.println(P2);
		System.out.println(P3);
	}

}
