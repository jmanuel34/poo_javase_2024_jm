package principal;

import service.Punto;
import service.Punto3D;

public class test {

	public static void main(String[] args) {
		Punto3D p3d =new Punto3D(25);
		p3d.imprimir();
		
		Punto p = new Punto(5,7);
		p.imprimir();

	}

}
