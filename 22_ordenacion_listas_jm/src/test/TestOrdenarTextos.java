package test;

import java.util.ArrayList;
import java.util.List;

public class TestOrdenarTextos {

	public static void main(String[] args) {
		List<String> textos= new ArrayList<String>(List.of("hello", "bye", "Adios"));
		textos.sort((a,b)->a.compareTo(b));
		textos.forEach(n->System.out.println(n));
	}

}
