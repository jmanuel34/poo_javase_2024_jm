package principal;

import service.Condicion;
import service.ListaNumber;
class Impares implements Condicion{
	@Override
	public boolean test(Integer n) {
		return n%2!=0;
	}
}
public class Test {

	public static void main(String[] args) {
		ListaNumber lst=new ListaNumber();
		lst.add(20);
		lst.add(11);
		lst.add(30);
		lst.add(20);
		lst.add(17);
		lst.eliminarNumeros(new Impares());
		System.out.println(lst.first());
		System.out.println(lst.last());
		System.out.println(lst.sum());
		
	}

}
