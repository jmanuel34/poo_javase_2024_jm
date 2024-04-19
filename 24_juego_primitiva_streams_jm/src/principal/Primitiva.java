package principal;

import java.util.stream.Stream;

/*
 * Realizar un programa que muestre la combinacion ganadora
 * de la primitiva (6 numeros aleatorios no repetidos entre 1 y 49
 */

public class Primitiva {

	public static void main(String[] args) {
	
//			Stream.generate(()->(int)Math.random()*49+1))
			Stream.generate(()->(int)(Math.random()*49+1) )
				.distinct()
				.limit(6)
				.forEach(n->System.out.println (n));
	}

}
