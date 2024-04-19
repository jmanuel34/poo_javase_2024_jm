package service;

import java.util.ArrayList;
import java.util.List;

import model.Producto;

public class ProductosService {
	List<Producto> productos=new ArrayList<>();
	public void altaProducto(Producto p) {
		productos.add(p);
	}
	public void bajarPrecio(int porcentaje) {
		productos.forEach(p->p.setPrecio(p.getPrecio()*((100-porcentaje)/100)));
	}
	public void subirPrecioCategoria(int porcentaje, String categoria) {
		productos.replaceAll(p->{
			if(categoria.equals(p.getCategoria())) {
				p.setPrecio(p.getPrecio()*((100+porcentaje)/100));				
			}
			return p;
		});
	}
	public void eliminarPorCategoria(String categoria) {
		productos.removeIf(n->n.getCategoria().equals(categoria));
	}
	public List<Producto> obtenerProductos(){
		return productos;
	}
	public void ordenarPorPrecio() {
		productos.sort((a,b)->Double.compare(a.getPrecio(), b.getPrecio()));
	}
}
