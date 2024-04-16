package principal;

import service.Circulo;
import service.Figura;
import service.Triangulo;

public class TestFiguras {

	public static void main(String[] args) {
		//crear un Triangulo y un circulo con color
		//y propiedades cualquiera, y después mostrar
		//el color y area de cada uno
		Circulo cr=new Circulo("amarillo", 5);
		Triangulo tr=new Triangulo("marrón",5,8);
		/*System.out.println("color:"+cr.getColor());
		System.out.println("area:"+cr.area());
		System.out.println("color:"+tr.getColor());
		System.out.println("area:"+tr.area());*/
		imprimir(cr);
		imprimir(tr);

	}
	
	public static void imprimir(Figura f) {
		System.out.println("color:"+f.getColor());
		System.out.println("area:"+f.area());
	}

}
