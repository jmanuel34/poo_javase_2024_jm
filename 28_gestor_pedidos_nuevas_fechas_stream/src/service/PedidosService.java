package service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import model.Pedido;

public class PedidosService {
	HashSet<Pedido> pedidos=new HashSet<>();
	
	public void nuevoPedido(Pedido pedido) {
		pedidos.add(pedido);
	}
	
	// Devuelve el pedido mas reciente.
	// Si hubiera mas de uno que cumpla la condicion, que devuelve el que tiene más unidades
	public Optional<Pedido> pedidoMasReciente() {
		/*Pedido pAux=null;
		LocalDate fMax=LocalDate.of(0,1,1); //1/1/1970
		for(Pedido p:pedidos) {
			//si encontramos pedido con fecha más reciente que fMax
			//actualizamos fMax y pAux
			if(p.getFechaPedido().isAfter(fMax)) {
				fMax=p.getFechaPedido();
				pAux=p;
			}
		}
		return pAux;*/
		/*
		return pedidos.stream()//Stream<Pedido>
				//.max(Comparator.comparing(p->p.getFechaPedido()))
				.max((a,b)->a.getFechaPedido().compareTo(b.getFechaPedido())						
						
						);
			//*/
		return pedidos.stream()
				.max(Comparator.comparing((Pedido p)->p.getFechaPedido())
						.thenComparingInt((p)->p.getUnidades())
						);
	}
	
	public List<Pedido> pedidosEntreFechas(LocalDate f1, LocalDate f2) {
		/*ArrayList<Pedido> aux=new ArrayList<Pedido>();
		for(Pedido p:pedidos) {
			//si fecha del pedido es posterior o igual a f1 y anterior o igual a f2, se incluye
			if(p.getFechaPedido().compareTo(f1)>=0&&p.getFechaPedido().compareTo(f2)<=0) {
				aux.add(p);
			}
		}
		return aux;*/
		return pedidos.stream()
				.filter(p->p.getFechaPedido().compareTo(f1)>=0&&p.getFechaPedido().compareTo(f2)<=0)//Stream<Pedido>
				.collect(Collectors.toList());
	}
	
	public Pedido pedidoProximoFecha(LocalDate fecha) {
		/*Pedido pAux=new Pedido();
		pAux.setFechaPedido(LocalDate.of(1, 1, 1));
		//comparamos la diferencia de días entre la fecha de cada pedido y la 
		//parámetro, con la diferencia de días entre la fecha auxiliar y la parámetro
		//si la del pedido es inferior, actualizamos la variable pedido auxiliar
		for(Pedido p:pedidos) {
			if(Math.abs(ChronoUnit.DAYS.between(p.getFechaPedido(), fecha))<
					Math.abs(ChronoUnit.DAYS.between(pAux.getFechaPedido(), fecha))) {
				pAux=p;
			}
		}
		return pAux;*/
		
		return pedidos.stream()
				//.min(Comparator.comparingLong(p->Math.abs(ChronoUnit.DAYS.between(p.getFechaPedido(), fecha))))
				.min((a,b)->Long.compare(Math.abs(ChronoUnit.DAYS.between(a.getFechaPedido(), fecha)), 
						Math.abs(ChronoUnit.DAYS.between(b.getFechaPedido(), fecha))))
				.orElse(null);
		
	}
/*
 * Devuelve la lista de pedidos del producto recibido como parametro
 */
	public List<Pedido> pedidosProducto(String producto) {
		return pedidos.stream()
				.filter(p->p.getProducto().equalsIgnoreCase(producto))
				.toList();
				// collect (Collectors.toList())
	}
	
/*
 * Devuelve el pedido con menor numero de unidades. Si hay mas de uno, cualquiera de ellos
 */
	public Optional<Pedido> pedidosMenorUnidades() {
		return pedidos.stream()
				.min(Comparator.comparingInt(p->p.getUnidades()));
	}
/*
 * Devuelve una cadena con los nombres de todos los productos sin duplicar
 * separados por un -
 */
	public String nombresProductos() {
		return pedidos.stream()		//stream de pedidos Stream<Pedido>
				.map(p->p.getProducto())	// Stream<String>
				.distinct()
				.collect(Collectors.joining("-"));
	}
}
