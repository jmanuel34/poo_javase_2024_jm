package service;

import java.util.ArrayList;

public class NotasService {
	ArrayList<Double> notas = new ArrayList<>();
	
	public void agregarNota(Double nota) {	
		notas.add(nota);
	}
	
	public double calcularMedia() {
		return notas.stream()
				.mapToDouble(n->n)
				.average()
				.orElse(0.0);
	}
	
	public double max() {
		return notas.stream()
				.mapToDouble(n->n)
				.max()
				.orElse(0.0);
	}
	
	public double min() {
		return notas.stream()
				.mapToDouble(n->n)
				.min()
				.orElse(0.0);
	}
	
	public int totalAprobados() {
		return (int)notas.stream()
				.filter(n->n>=5)
				.count();
	}
	
	public Double [] devolverNotas() {		
/*
		double[] arNotas = new double[notas.size()];
		
		for (int i=0; i<notas.size(); i++) {
			arNotas[i]=notas.get(i);			
		}
		return arNotas;
//*/
		return notas.toArray(new Double[0]);
	}
}
