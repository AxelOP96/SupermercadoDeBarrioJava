package tienda;

public abstract class Productos implements Comparable{
	
	protected String nombre;
	protected Integer precio;
	
	public Productos() {
		
	}
	public Productos(String nombre, Integer precio) {
		this.nombre=nombre;
		this.precio=precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Productos [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	public int compareTo(Productos o1, Productos o2) {
		
		return Integer.compare(o1.getPrecio(), o2.getPrecio());
	}
}
