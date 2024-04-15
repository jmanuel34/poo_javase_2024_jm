package service;

public class Triangulo extends Figura implements Operaciones{
	private double base, altura;
	private double semiPerimetro;

	
	public Triangulo(String color, double base, double altura) {
		super(color);
		this.base= base;
		this.altura= altura;
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		return base*altura/2;
	}
/*	
	public double areaSemiperimetro(double semiperimetro, ) {
		return Math.sqrt(semiperimetro (s-a)(s-b)(s-c))
		
	}
*/


	@Override
	public void girar(int grados) {
		base+=grados;
		altura+= grados;
		
	}


	@Override
	public int invertir() {
		double aux;
		aux = base;
		altura = base;
		base= aux;
		return 1;
	}


}
