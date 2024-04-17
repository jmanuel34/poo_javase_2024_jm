package service;
//método que recibe una lista de números e imprime los pares
	//método que recibe un conjunto de números y guarda en un fichero los positivos
	//método que recibe una lista y guarda en un fichero los múltiplos de cinco
	//método que recibe un conjunto de números e imprime los negativos
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class OperacionesService {

///método que recibe una lista de números e imprime los pares
	//método que recibe un conjunto de números y guarda en un fichero los positivos
	//método que recibe una lista y guarda en un fichero los múltiplos de cinco
	//método que recibe un conjunto de números e imprime los negativos/*	
	public int sumarPorCondicion(List<Integer> numeros, Predicate<Integer> condicion) {
		int suma=0;
		for(Integer n:numeros) {
			if(condicion.test(n)) {
				suma+=n;
			}
		}
		return suma;
	}
	//*/
	public void procesarPorCondicion(Collection<Integer> nums, 
									Consumer<Integer> operacion, 
									Predicate<Integer> condicion) {
		for (Integer n: nums) {
			if (condicion.test(n)) {
				operacion.accept(n);
			}
		}
	}
}
