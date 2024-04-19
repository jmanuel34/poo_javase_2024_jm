package test;

import java.util.ArrayList;
import java.util.List;

public class TestOrdenarEnteros {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>(List.of(12,5,9,2,17,4));
		nums.sort((a,b)->b-a);		// Si (b-a) sale positivo interpreta que b es mas pequeño
		nums.forEach(n->System.out.println(n));
	}

}
