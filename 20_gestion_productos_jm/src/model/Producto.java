package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Producto {
	private String nombre;
	private double precio;
	private String categoria;

}
