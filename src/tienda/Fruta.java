package tienda;

public class Fruta extends Productos {
	private String unidadDeVenta;
	
	public Fruta() {
		
	}
	//Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo
	public Fruta(String nombre,Integer precio,String unidadDeVenta) {
		super(nombre, precio);
		this.unidadDeVenta=unidadDeVenta;
	}
	//Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo
	@Override
	public String toString() {
		return "Nombre: " + nombre + " /// Precio: $" + precio + " /// Unidad de venta: " +  unidadDeVenta;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
