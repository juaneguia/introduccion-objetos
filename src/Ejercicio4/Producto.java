package Ejercicio4;

public class Producto {
	private String nombre;
	private double precio;
	private int CantDeStock;
	
	public Producto(String nombre, double precio, int cantDeStock) {
		this.nombre = nombre;
		this.precio = precio;
		CantDeStock = cantDeStock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantDeStock() {
		return CantDeStock;
	}

	public void setCantDeStock(int cantDeStock) {
		CantDeStock = cantDeStock;
	}

	@Override
	public String toString() {
		return "Producto Nombre: " + nombre + ", Precio: " + precio + ", CantDeStock: " + CantDeStock;
	}
	
}
