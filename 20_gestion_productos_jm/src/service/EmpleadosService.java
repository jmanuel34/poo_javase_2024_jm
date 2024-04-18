package service;

import java.util.ArrayList;
import java.util.List;

import model.Producto;

/*
 * Programa para gestión de productos. 
 * Cada producto tendrá: nombre, precio, categoria
 * La lógica de negocio, expondrá los siguientes métodos:
 * -eliminarPorCategoria: elimina de la lista aquellos productos que pertenezcan a la categoría indicada
 * -bajarPrecio: Baja el precio de todos productos en el porcentaje indicado
 * -subirPrecioCategoria: Sube el precio a todos los productos de la categoría indicada, en 
 * el porcentaje indicado
 * -obtenerProductos: Devuelve la lista de productos existentes
 * -agregarProducto: Añade el producto recibido 
 *
 */
//*/
public class EmpleadosService {
	List<Producto> productos = new ArrayList<>();

	public void eliminarPorCategoria(String categoria) {
		productos.removeIf(n->n.getCategoria().equals(categoria));
	}
	
	public void bajarPrecio(int cantidad) {
		productos.forEach(n->n.setPrecio(n.getPrecio()-n.getPrecio()*cantidad/100));
	}
	public void  subirPrecioCategoria(int cantidad, String categoria) {
//		productos.forEach(n->n.setPrecio(n.getPrecio()-n.getPrecio()*cantidad/100));
		productos.replaceAll(p->{
					if (categoria.equals(p.getCategoria())) {
						p.setPrecio(p.getPrecio()*(100-cantidad)/100);
					}
					return p;
		});
	}
	public List<Producto> obtenerProductos() {
		return productos;
	}
	
	public boolean agregarProducto(Producto producto) {
		if (productos.add(producto)) return true;
		return false;
	}
	
}
