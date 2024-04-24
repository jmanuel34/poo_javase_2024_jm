package pruebas;

import java.util.List;

public class Test13Peek {

	public static void main(String[] args) {
		List<Integer> nums= List.of(11,4,5,8);
		/*
		 * Mustra cada numero de la lista y el total de ellos
		 */
		System.out.println("Total de numeros: "+
			nums.stream()
				.distinct()
				.peek(n->System.out.println(n))	  // Stream<Integer>
				.count()
		);
	}

}
