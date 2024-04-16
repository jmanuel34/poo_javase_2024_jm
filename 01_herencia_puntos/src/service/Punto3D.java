package service;

public class Punto3D extends Punto{
	private int z;
	public Punto3D(int z) {
		//super();//llamada a constructor sin parámetros de la superclase
		this.z=z;
	}

	public Punto3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		super.imprimir();
		System.out.println(","+z);
	}
	
}
