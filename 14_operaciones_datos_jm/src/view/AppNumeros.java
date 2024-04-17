package view;

import java.util.List;

import service.Condicion;
import service.OperacionesService;

class SumaPares implements Condicion {

	@Override
	public boolean test(Integer n) {
		if (n % 2 == 0)
			return true;
		return false;
	}

	class SumaPositivos implements Condicion {

		@Override
		public boolean test(Integer n) {
			if (n >= 0)
				return true;
			return false;
		}

	}
}

public class AppNumeros {

	public static void main(String[] args) {
		OperacionesService service = new OperacionesService();
		List numeros = List.of(3, -1, 5, 7, 3, -5, 8, 9, 5, 4);
		// imprimir por un lado la suma de los pares y por otro la suma de los negativos
		OperacionesService service = new OperacionesService();
		System.out.println(service.sumarPorCondicion(, ));
		System.out.println(service.sumaPositivos(numeros));
		System.out.println("Suma positivos"+service.);
	}
}
