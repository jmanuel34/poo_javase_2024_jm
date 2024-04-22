package test;

import java.util.List;

public class Test5Filter {
	public static void main(String[] args) {
		List<Integer> nums = List.of(25, 8, 2, 25, -3, 3, 4, 11, -1, -20, 8, 2);
		
		  nums.stream() .filter(n->n<0) 
		  .findFirst() // .get()
		  .ifPresentOrElse(n->System.out.println(n),
		  ()->System.out.println("No hay negativos"));
		  
		 //*/
		nums.stream().filter(n -> n < 0) // Stream<Integer>. Solo con los negativos
				.findFirst() // Optional<Integer>
				.ifPresentOrElse(n -> System.out.println(n), 
						() -> System.out.println("No hay negativos!!"));
	}
}
