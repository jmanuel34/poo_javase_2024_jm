package test;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Realizar una llamada a cada método service
 */
import service.FuncionalesService;

public class Test {

	public static void main(String[] args) {
		FuncionalesService service = new FuncionalesService();
		
		Set<Integer> conjunto = new HashSet<Integer>();
		
		conjunto.add(1);conjunto.add(4);conjunto.add(5);conjunto.add(6);
		conjunto.add(7);conjunto.add(8);conjunto.add(9);conjunto.add(10);

//		service.m1(Set.of(8,4,7), s->s.length());
//		service.m1(Set.of(8,4,7), String::length);			//Sustituye la linea superior
		
		// Devuelve objeto y lo procesa
//		service.m2(()->"hello", a->System.out.println(a));
		service.m2(()->"hello", System.out::println);		//Sustituye la linea superior
		
//		service.m3((a, b)->a+b, (a,b)->a);
		
//		service.m4((a,b)->System.out.println(a+b), (a,b)->a.length()>b);

//		service.m5(()->5, List.of("a","b"));
//		service.m6(Map.of("a", 1, "b", 6), (a,b)->System.out.println (a+b));
//		service.m7(a->List.of(a.length(),5,1));
//*/
//		Consumer 	(accept)  	Entra T devuelve void  		Procesa datos
//		Function 	(apply)   	Entra T devuelve R    		Transforma datos
//		Predicate 	(test)   	Entra T devuelve boolean	Establece condiciones
//		Supplier 	(get)		Entra - devuelve T			Generacion de datos
		
	}

}
