/**
 * 
 */
package util;

import java.util.ArrayList;
import java.util.List;

/**
 * Crear una subinterfaz de List<Integer>, que añada los siguientes métodos
 * estáticos: 
 * 
 * -List<Integer> ofPares(int n). 
 * Devuelve una lista con los n primeros numeros pares 
 * 
 * -List<Integer> ofPositivos(int ... data). 
 * Devuelve una lista solo con los números positivos del grupo de números recibidos como
 * parámetro
 */

public interface InterfazLista extends List<Integer> {


		static List<Integer> ofPares(int n){
			Integer[] result=new Integer[n];
			int num=0,cont=0;
			while(cont<n){
				result[cont]=num;
				num+=2;
				cont++;
			}
			return List.of(result);
		}
		static List<Integer> ofPositivos(int ... data){
			var result=new ArrayList<Integer>();
			for(int n:data) {
				if(n>0) {
					result.add(n);
				}
			}
			return result;
		}
	
}

/*
static List<Integer> ofPares(int n) {
	/*
	 * ArrayList<Integer> pos = new ArrayList<>(); for (Integer i=0; i<=n; i++) { if
	 * (n %2 == 0) { pos.add(n); } } return pos;
	 */
//}
	//*/
/*
	Integer[]result =new Integer[n];
	int num=0; cont=0;
	while (cont<n) {
		result[cont]=num;
		num+=2;
		cont++;
	}
	return List.of(ressult);
	
}
static List<Integer> ofPositivos(int... data) {
//*/
//*/
/*
	ArrayList<Integer> pos = new ArrayList<>();
	for (Integer n : data) {
		if (n > 0) {
			pos.add(n);
		}
	}
	return pos;
//*/
//}

