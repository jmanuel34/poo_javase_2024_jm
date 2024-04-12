package service;

public class Triangulo extends Figura{
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
	

}
