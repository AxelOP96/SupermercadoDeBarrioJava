package tienda;

import java.util.ArrayList;

public class Supermercado {
	ArrayList<Productos> changuito = new ArrayList<>();
	
	public void cargaDeProducto(Productos o1, Productos o2, Productos o3, Productos o4) {
		changuito.add(o1);
		changuito.add(o2);
		changuito.add(o3);
		changuito.add(o4);
	}
	public void mostrarLista() {
		for(Productos lista : changuito) {
			System.out.println(lista);
		}
		imprimirSeparador();
		imprimirExtremos();
	}
	
	public void imprimirSeparador() {
		System.out.println("=============================");
	}
	public void imprimirExtremos() {
		Productos menorPrecio = null;
		Productos mayorPrecio = null;
		Integer mayorP = 0;
		Integer menorP =1000;
		for(Productos mayor: changuito) {
			if(mayorP < mayor.getPrecio()) {
				mayorP = mayor.getPrecio();
				mayorPrecio = mayor;
			}
				
		}
		
		for(Productos menor: changuito) {
			if(menorP > menor.getPrecio()) {
				menorP = menor.getPrecio();
				menorPrecio = menor;
			}
				
		}
		System.out.println("Producto más caro: " + mayorPrecio.getNombre());
		System.out.println("Producto más barato: " + menorPrecio.getNombre());
	}
	public static void main(String[] args) {
		/*Imaginemos un supermercado de barrio.


Crear un programa cuyo punto de entrada sea un main en donde, al ejecutarse, se visualiza lo siguiente por consola y se termina la ejecución:



Nombre: Coca-Cola Zero /// Litros: 1.5 /// Precio: $20

Nombre: Coca-Cola /// Litros: 1.5 /// Precio: $18

Nombre: Shampoo Sedal /// Contenido: 500ml /// Precio: $19

Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo

=============================

Producto más caro: Frutillas

Producto más barato: Coca-Cola


La solución debe cumplir con los siguientes requisitos:

Diseñar una solución orientada a objetos.
La salida es por consola y exactamente como se requiere.
Usar solamente las clases provistas por Java 8..
Cargar la lista de productos en un único método. No hay ingreso por pantalla de ningún tipo.
El algoritmo usado para la impresión no tiene que depender de la cantidad o tipo de productos.
Para mostrar el mayor / menor, utilizar la interfaz Comparable.
Para imprimir por pantalla, sobrescribir el método toString()*/
		Productos CocaColaZero = new Bebida("Coca-Cola Zero", 1.5, 20);
		Productos CocaCola = new Bebida("Coca-Cola", 1.5, 18);
		Productos Shampoo = new Limpieza("Shampoo Sedal", 500, 19);
		Productos Strawberry = new Fruta("Frutillas", 64, "kilo");
		Supermercado supermercadoDeBarrio = new Supermercado();
		
		supermercadoDeBarrio.cargaDeProducto(CocaColaZero, CocaCola, Shampoo, Strawberry);
		supermercadoDeBarrio.mostrarLista();
	}

}
