package service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class NotasService {
	ArrayList<Double> notas=new ArrayList<Double>();
	public void agregarNota(double nota) {
		notas.add(nota);
	}
	public double media() {
		/*return notas.stream()
				.mapToDouble(n->n)//DoubleStream
				.average()
				.orElse(0);*/
		return notas.stream()
				.collect(Collectors.averagingDouble(n->n));
	}
	public double max() {
		/*
		return notas.stream()
				.mapToDouble(n->n)//DoubleStream
				.max()
				.orElse(0);
	//*/
//		return notas.stream()
//				.collect(Collectors.maxBy(Comparator.comparingDouble(n->n)))
//				.orElse(0.0));
				
		return notas.stream()
						.collect(Collectors.maxBy(Comparator.comparingDouble(n->n)))
						.orElse(0.0);

	}
	public double min() {
		return notas.stream()
				.mapToDouble(n->n)
				.min()
				.orElse(0);
	}
	public int totalAprobados() {
		return (int)notas.stream()
				.filter(n->n>=5)
				.count();
	}
	public Double[] obtenerNotas() {
		/*double[] todas=new double[notas.size()];
		for(int i=0;i<notas.size();i++) {
			todas[i]=notas.get(i);
		}
		return todas;*/
		return notas.toArray(new Double[0]);
	}
	
	/*
	 * Antonio Martin
	 * notas.stream
()
				.mapToDouble(n->n)//DoubleStream
				.max()
				.orElse(0);*/
//		return 
notas.stream
()
				.collect(Collectors.maxBy(Comparator.comparingDouble(n->n)))
				.orElse(0.0);
	}
	public double min() {
		/*return 
notas.stream
()
				.mapToDouble(n->n)
				.min()
				.orElse(0);*/
		return 
notas.stream
()
				.collect(Collectors.minBy(Comparator.comparingDouble(n->n)))
				.orElse(0.0);
	} 
	 * 
	 */
}
