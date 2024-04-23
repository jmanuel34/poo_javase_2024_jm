package test;

import java.util.ArrayList;
import java.util.List;

public class TestOrdenarTextos {

	public static void main(String[] args) {
		List<String> textos= new ArrayList<String>(List.of("hello", "bye", "Adios", "zzpaf"));
		textos.sort((a,b)->b.compareTo(a));
		textos.forEach(n->System.out.println(n));
	}

}
