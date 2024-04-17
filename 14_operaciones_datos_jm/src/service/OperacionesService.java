package service;

import java.util.List;

public class OperacionesService {
	/* Metodo que recibe una lista de numeros enteros
	 * y devuelve la suma de los pares
	 */
/*
	public int sumaPares(List<Integer> lista) {
		int suma=0;
		for (Integer l:lista) {
			if (l%2==0) suma+=l;
		}
		return suma;
	}
//*/	
	/*
	 * Metodo que recibe una lista de numeros enteros y devuelve la suma de los positivos
	 */
/*		
	public int sumaPositivos(List<Integer> numeros) {
		int suma = 0;
		for (Integer n:numeros) {
			if (n>=0) suma+=n;
		}
		return suma;
	}
//*/	
	/*
	 * Metodo que recibe una lista de numeros enteros y devuelve la suma de los 
	 * multiplos de 5
	 */
	
	/*
	 * Recibe una lista de numeros y una condicion
	 * Devuelve la suma de los numeros y cumple la condicion
	 */
	public int sumarPorCondicion(List<Integer> numeros,  Condicion condicion) {
		int suma= 0;
		for (Integer n:numeros) {
			if (condicion.test(n)) suma+=n;
		}
		return suma;
	}
}
