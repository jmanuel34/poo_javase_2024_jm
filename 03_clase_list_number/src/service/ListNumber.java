package service;

/*
 * Vamos a crear una clase, llamada ListNumber, para
 * manejar listas de números enteros.
 * La clase, heredará ArrayList<Integer>, e incorporará
 * las siguientes mejoras:

 * -Método first() que devuelve el primer elemento de la lista
 * -Método last() que devuelve el último elemento de la lista
 *(ambos devuelven null si la lista está vacía)
-Método sum() que devuelve la suma de todos 
los elementos de la lista

-No debe permitir añadir números ya existentes 

 */
import java.util.ArrayList;

public class ListNumber extends ArrayList<Integer>{

	public Integer first() {
		if (size()==0) {
			return null;		// Si esta vacia devolvemos null
		}
		return get(0);
	}
	
	public Integer last() {
		if (size()==0) {
			return null;		// Si esta vacia devolvemos null
		}
		return get(size() -1);
	}

	public int sum() {
		int suma=0;
		for (int i=0; i<size(); i++) {
			suma+=get(i);
		}	
		return suma;
	}
	@Override
	public boolean add(Integer e) {
		if (!contains(e)) return super.add(e);
				return super.add(e);
		/*		boolean res = true;
			if (this.contains(e)) res= false;
			else this.add(e);
		return res;
		*/
	}
}
