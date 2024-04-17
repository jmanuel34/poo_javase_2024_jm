package view;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
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

///método que recibe una lista de números e imprime los pares
	//método que recibe un conjunto de números y guarda en un fichero los positivos
	//método que recibe una lista y guarda en un fichero los múltiplos de cinco
	//método que recibe un conjunto de números e imprime los negativos/*
public class AppNumeros {

	public static void main(String[] args) {
		List<Integer> numeros=List.of(3,-2,8,5,1,17,22,-9,6,12);
		//imprimir, por una lado, la suma de los pares
		//y por otro la suma de los positivos
		OperacionesService service=new OperacionesService();
		//Condicion cond=(Integer n)->n>0 ;
//		System.out.println("Suma positivos: "+service.sumarPorCondicion(numeros,n->n>0));
//		System.out.println("Suma pares: "+service.sumarPorCondicion(numeros, n->n%2==0));
//		// Suma los negativos mayores de -5
//		System.out.println(service.sumarPorCondicion(numeros, n->(n<0 && n>-5)));
		Predicate<Integer> negativo = n->n<0;
//		System.out.println(service.sumarPorCondicion(numeros, (negativo.and(n->n<-5))));
	
		// imprimir los positivos
		String ruta = "../../ficheros/numeros.txt";
		service.procesarPorCondicion(numeros, n->System.out.println(n), n->n>0);
		
			service.procesarPorCondicion(numeros, n-> {
				try (FileOutputStream fos= new FileOutputStream(ruta, true); 
						PrintStream out= new PrintStream(fos);) {
						out.println(n);
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}, n->n%2!=0);
		
		service.procesarPorCondicion(numeros, n->System.out.println(n), n->n>0);
		
	}

}
