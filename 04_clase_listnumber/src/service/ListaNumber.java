package service;

import java.util.ArrayList;

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
	
	
}
