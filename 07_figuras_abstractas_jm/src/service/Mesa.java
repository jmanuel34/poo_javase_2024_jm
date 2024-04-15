package service;
/*
 * Añadir una nueva clase llamada Mesa, con tres atributos (alto,ancho y largo)
que implemente la interfaz Operaciones 
 */
public class Mesa implements Operaciones{
	int alto, ancho, largo;
	
	public Mesa(int alto, int ancho, int largo) {
		super();
		this.alto = alto;
		this.ancho = ancho;
		this.largo = largo;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	@Override
	public void girar(int grados) {
		alto += grados;
		System.out.println("Girando mesa ...");
	}

	@Override
	public int invertir() {
		ancho *= -1;
		System.out.println("Invirtiendo mesa ...");
		return ancho*alto;
	}

}
