package principal;

import service.ListaNumber;

public class Test {

	public static void main(String[] args) {
		ListaNumber lst=new ListaNumber();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		
		lst.tansformarNumeros(n->n*n);
		lst.eliminarNumeros(n->n%2==0);
//		System.out.println(lst.first());
//		System.out.println(lst.last());
		System.out.println(lst.sum());
//		System.out.println();
		
	}

}
