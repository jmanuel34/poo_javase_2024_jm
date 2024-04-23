package service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.stream.Collectors;

import model.Pedido;

public class PedidosService {
	HashSet<Pedido> pedidos=new HashSet<>();
	
	public void nuevoPedido(Pedido pedido) {
		pedidos.add(pedido);
	}
	
	public Pedido pedidoMasReciente() {
//		return pedidos.stream()
//				.collect(Collectors.maxBy(Comparator.comparing(p->p.getFechaPedido()));
//	return pedidos.stream()
//			.max(Comparator.comparing(p->p.getFechaPedido)))
//			.orElse(null);
	return pedidos.stream()	
			.max(a,b)->a.getFechapedido().compareTo(b.getFechaPedido())
			.orElse (null);
	}
	
	public List<Pedido> pedidosEntreFechas(LocalDate f1, LocalDate f2) {
		
	}
	
	public Pedido pedidoProximoFecha(LocalDate fecha) {
		
	}
}
