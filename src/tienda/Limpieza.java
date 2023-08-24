package tienda;

public class Limpieza extends Productos {
	private Integer contenido;
	
	public Limpieza(String nombre, Integer contenido,Integer precio) {
		super(nombre, precio);
		this.contenido=contenido;
	}
	//Nombre: Shampoo Sedal /// Contenido: 500ml /// Precio: $19

	@Override
	public String toString() {
		return "Nombre: " + nombre + " /// Contenido: " + contenido + "ml /// Precio: $" + precio;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
