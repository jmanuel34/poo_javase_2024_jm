package principal;

import java.util.ArrayList;
import java.util.List;

public class TestRemoveif {

	public static void main(String[] args) {
		List<Integer> nums= new ArrayList<>(List.of(3,6,10,-5,7,-1));
		nums.removeIf(n->n%2<0);
		nums.forEach(n->System.out.println(n));
	}

}
