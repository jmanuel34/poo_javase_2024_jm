package principal;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class Prueba1 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList();
		nums.add(25); nums.add(34); nums.add(12); nums.add(2);
		
		Vector <Integer> nums2= new Vector<>();
		nums2.add(25); nums2.add(34); nums2.add(12); nums2.add(2);
		System.out.println(SumarPares(nums));
		System.out.println(SumarPares(nums2));
		
		Collection<Integer> numsCollection = new ArrayList<Integer>();
		
		

	}
	
	/*
	 *  Crear un metodo que reciba una lista de Integer y devuelva
	 *  la suma de los pares de dicha lista
	 */
	public static int SumarParesm(List<Integer> lista) {
		int pares = 0;
		for (Integer l:lista) {
			if (l%2 == 0) {
				pares+=0;
			}
		}
		return pares;
	}
	/*
	 * Crear un metido que reciba una coleccion de Integer
	 * y devuelva la media de los valores de dicha coleccion
	 */
	public static int mediaCollection (Collection<Integer> col ) {
		int media = 0;
		for (Integer l:col) {
			if (l%2 == 0) {
				media+=l;
			}
		}
		return media/col.size();
	}
}
