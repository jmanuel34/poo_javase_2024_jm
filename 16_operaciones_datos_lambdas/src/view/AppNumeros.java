package view;

import java.util.List;
import java.util.function.Predicate;

import service.OperacionesService;
/*class Positivos implements Condicion{
	@Override
	public boolean test(Integer n) {
		return n>0;
	}
}
class Pares implements Condicion{
	@Override
	public boolean test(Integer n) {
		return n%2==0;
	}
}*/
public class AppNumeros {

	public static void main(String[] args) {
		List<Integer> numeros=List.of(3,-2,8,5,1,17,22,-9,6,12);
		//imprimir, por una lado, la suma de los pares
		//y por otro la suma de los positivos
		OperacionesService service=new OperacionesService();
		//Condicion cond=(Integer n)->n>0 ;
		System.out.println("Suma positivos: "+service.sumarPorCondicion(numeros,n->n>0));
		System.out.println("Suma pares: "+service.sumarPorCondicion(numeros, n->n%2==0));
		// Suma los negativos mayores de -5
		System.out.println(service.sumarPorCondicion(numeros, n->(n<0 && n>-5)));
		Predicate<Integer> negativo = n->n<0;
		System.out.println(service.sumarPorCondicion(numeros, (negativo.and(n->n<-5))));
	}

}
