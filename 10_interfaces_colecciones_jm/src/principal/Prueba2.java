package principal;

import java.util.ArrayList;
import java.util.List;

public class Prueba2 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(11);nums.add(1);nums.add(13);
		nums.add(11);nums.add(6);nums.add(15);nums.add(11);
		List<Integer> sublista= nums.subList(3, 7);
		for (Integer n:sublista) {
			System.out.println(n);
		}
		System.out.println(sublista.getClass().getName());
	}

}
