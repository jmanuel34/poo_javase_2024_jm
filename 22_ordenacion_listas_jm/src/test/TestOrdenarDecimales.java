package test;

import java.util.ArrayList;
import java.util.List;

public class TestOrdenarDecimales {

	public static void main(String[] args) {
		List<Double> nums = new ArrayList<>(List.of(4.5,4.3,4.0,2.8,17.1,4.2));
//		nums.sort((a,b)->(int)(a-b));
//		nums.sort((a,b)->(a>b?1:-1));
//		nums.sort((a,b)->a.compareTo(b));
		nums.sort((a,b)->Double.compare(a, b));
		
		nums.forEach(n->System.out.println(n));
	}

}
