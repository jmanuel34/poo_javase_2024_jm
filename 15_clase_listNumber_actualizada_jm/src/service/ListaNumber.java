package service;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaNumber extends ArrayList<Integer>{
	public Integer first() {
		if(size()==0) { //si está vacía devolvemos null
			return null;
		}
		return get(0);
	}
	public Integer last() {
		if(size()==0) { //si está vacía devolvemos null
			return null;
		}
		return get(size()-1);
	}
	public int sum() {
		int suma=0;
		/*for(int i=0;i<size();i++) {
			suma+=get(i);
		}*/
		for(Integer n:this) {
			suma+=n;
		}
		return suma;
	}
	@Override
	public boolean add(Integer e) {
		if(!contains(e)) {
			return super.add(e);
		}
		return false;
	}
	//nuevo método eliminarNumeros:elimina los numeros de la lista que cumplan
	// una condicion
	public void eliminarNumsPorCondicion(Condicion condicion) {
		Iterator<Integer> it = iterator();
		
		while(it.hasNext()) {
			if (condicion.test(it.next()))
				it.remove();
//		for (Integer n:this) {
//			if (condicion.test(n)) remove(n);
		}
	}
	
	public void transformar(Transformacion tr) {
		Iterator<Integer> it = iterator();
		for (int i=0; i<size(); i++) {
			set (i, tr.test(i));
		}
	}
	
}
