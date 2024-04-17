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
	
	//nuevo método eliminarNumeros:elimina los números de la
	//lista que cumplan una condición
	public void eliminarNumeros(Condicion condicion) {
		/*for(Integer n:this) {
			//si cumple la condición lo eliminamos
			if(condicion.test(n)) {
				remove(n);
			}
		}*/
		/*for(int i=0;i<size();i++) {
			if(condicion.test(get(i))) {
				remove(i);
			}
		}*/
		Iterator<Integer> it=iterator();
		while(it.hasNext()) {
			if(condicion.test(it.next())){
				it.remove();
			}
		}
	}
	
	//método para transformar cada número de la lista en otro. Debería
	//ser capaz de transformar cada número en su cuadrado, en la mitad,
	//en su raiz cúbica, etc...
	
	public void transformarNumeros(Transformacion tx) {
		for(int i=0;i<size();i++) {
			set(i,tx.transformar(get(i)));
		}
	}
	
}
