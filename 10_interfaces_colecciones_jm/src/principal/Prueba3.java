package principal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Prueba3 {

	public static void main(String[] args) {
		ArrayList<Integer> nums1 = new ArrayList<>();
		ArrayList<Integer> nums2 = new ArrayList<>();
		
		// Recorremos el resultado con un iterator
		nums1.add(11);nums1.add(1);nums1.add(13);
		nums2.add(11);nums2.add(6);nums2.add(15);nums2.add(11);
		Set<Integer> res= iguales (nums1,nums2);
		Iterator<Integer> it = res.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

/*
 * Realizar un metodo que recibe dos colecciones de enteros
 * y devuelve un conjunto con los numeros contenidos en ambas colecciones
 */
	
	public static Set<Integer> iguales(Collection <Integer> c1, Collection<Integer> c2) {
		Set<Integer> resultado = new HashSet<>();
		for (Integer c:c1) {
			if (c2.contains(c)) {
				resultado.add(c);
			}
		}
		return resultado;
	}


}
