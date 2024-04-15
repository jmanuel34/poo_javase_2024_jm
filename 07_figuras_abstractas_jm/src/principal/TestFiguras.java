package principal;

import service.Circulo;
import service.Figura;
import service.Operaciones;
import service.Triangulo;
/*
 * Crear un color y un circulo con propiedades iunventadas cualquiera uy despues
 * mostrar el color y superficio de cada uno.
 * 
 */
public class TestFiguras {

	public static void main(String[] args) {
		Figura c = new Circulo("rojo", 3);
		Figura t = new Triangulo ("marron", 5, 8);
		Triangulo tr = new Triangulo ("marron", 5, 8);
		imprimir (c);
		imprimir (t);
		
//		llamada a metodo que recibe la interfaz
		operar(tr);
	}
	static void imprimir (Figura f) {
		System.out.println("Area:" + f.area()+ ", Color: "+ f.getColor());
		
	}
	public static void operar(Operaciones oper) {
		oper.girar(100);
		System.out.println(oper.invertir());
	}
}
