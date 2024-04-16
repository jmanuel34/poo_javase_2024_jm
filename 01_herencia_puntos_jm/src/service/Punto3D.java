package service;

public class Punto3D extends Punto{
	private int z;
	
	public Punto3D (int z) {
		super();  // Implicita!!!!. Llamada al contructor sin parámetros de la superclase
		this.z = 0;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public void imprimir() {
		System.out.print("Las coordenadas son: "+this.getX()+","+this.getY()+ ","+this.getZ());
	}
}
