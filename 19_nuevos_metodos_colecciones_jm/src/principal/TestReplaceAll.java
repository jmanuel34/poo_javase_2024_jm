package principal;

import java.util.ArrayList;
import java.util.List;

public class TestReplaceAll {

	public static void main(String[] args) {
		List<Double> nums= new ArrayList<>(List.of(3.0,6.5,10.1,-5.3,7.0,-1.0));
		nums.replaceAll(n->n/2);
		nums.forEach(n->System.out.println(n));
	}

}
