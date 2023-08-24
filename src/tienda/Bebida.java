package tienda;

public class Bebida extends Productos {
	private Double contenido;
	
	public Bebida() {
		
	}
	public Bebida(String nombre, Double contenido, Integer precio ) {
		super(nombre, precio);
		this.contenido = contenido;
	}
	@Override
	public String toString() {
		return "Nombre: " + nombre + " /// Litros: " + contenido + " /// Precio: $" + precio + "";
	}
	@Override
	public int compareTo(Productos o1, Productos o2) {
		return Integer.compare(o1.getPrecio(), o2.getPrecio());
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
