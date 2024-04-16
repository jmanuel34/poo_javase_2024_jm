package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Prueba1Am {
	public static void main(String[] args) {

		ArrayList<Integer> nums1 = new ArrayList<Integer>();
		nums1.add(34);
		nums1.add(25);
		nums1.add(200);
		nums1.add(20);

		System.out.println(sumarPares(nums1));

		Vector<Integer> nums2 = new Vector<Integer>();
		nums2.add(4);nums2.add(11);
		nums2.add(67); nums2.add(6);
		
		System.out.println(sumarPares(nums2));
	}


//crear un método que reciba una lista de Integer
//y devuelva la suma de los pares de dicha lista
	public static int sumarPares(List<Integer> lista) {
		int pares = 0;
		for (Integer n : lista) {
			if (n % 2 == 0) {
				pares += n;
			}
		}
		return pares;
	}


}
