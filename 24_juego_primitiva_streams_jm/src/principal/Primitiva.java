package principal;

import java.util.List;
import java.util.stream.Stream;

/*
 * Realizar un programa que muestre la combinacion ganadora
 * de la primitiva (6 numeros aleatorios no repetidos entre 1 y 49
 * ordenador de menor a mayor
 */

public class Primitiva {

	public static void main(String[] args) {
		List nums;
			nums= Stream.generate(()->(int)(Math.random()*49+1))
				.distinct()
				.limit(6)
//				.forEach(n->System.out.println (n));
//				.forEach((int n)->nums.add(n));
//				.toArray();
				.sorted()
				.toList();
			nums.forEach(n->System.out.println(n));
			
			for (int fila=0; fila<10; fila++) {
				for (int columna=0; columna<5; columna++) {
					if (nums.contains(Integer.parseInt(String.valueOf(columna)+String.valueOf(fila))+1)) 
						System.out.print("x"+" ");
					else System.out.print("o"+" ");
				}
				System.out.println();
				
			}
	}
	
	
}
