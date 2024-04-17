package principal;

import service.Condicion;
import service.ListaNumber;
import service.Transformacion;

class Positivos implements Condicion{
	@Override
	public boolean test(int n) {
		return n >= 0;
	}
}

class Pares implements Condicion{
	@Override
	public boolean test(int n) {
		return n%2==0;
	}
}

class Impares implements Condicion{
	@Override
	public boolean test(int n) {
		return n%2!=0;
	}
}

//Metodo para transformar cada número de la lista
	// en otro diferente
	// Debe ser capaz de transformar un numero en su cuadrado,
	// en la mitad, en su raiz cubica, etc.

class Cuadrado implements Transformacion {

	@Override
	public int test(Integer n) {		
		return n*n;
	}
	
}

class RaizCuadrada implements Transformacion{
	@Override
	public int test(Integer n) {
		return (int)Math.sqrt(n);
	}
}

public class Test {

	public static void main(String[] args) {
		ListaNumber lst=new ListaNumber();
		lst.add(20); lst.add(31);lst.add(40);lst.add(50);
		lst.add(-60); lst.add(-75); lst.add(80);
		
		
//		System.out.println(lst.first());
//		System.out.println(lst.last());
//		System.out.println(lst.sum());
		
		lst.eliminarNumsPorCondicion(new Impares());
		System.out.println(lst.first());
		lst.transformar(new RaizCuadrada());
		System.out.println(lst.first());

		//		lst.eliminarNumsPorCondicion(new Pares());
//		System.out.println(lst.toArray());
//		lst.eliminarNumsPorCondicion(new Impares());
//		System.out.println(lst.toArray());

	}
	
	// Metodo para transformar cada número de la lista
	// en otro diferente
	// Debe ser capaz de transformar un numero en su cuadrado,
	// en la mitad, en su raiz cubica, etc.

}
