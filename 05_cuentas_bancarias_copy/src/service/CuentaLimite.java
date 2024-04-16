package service;

public class CuentaLimite extends Cuenta {
	private double limite;

	public CuentaLimite(double saldo, double limite) {
		super(saldo);
		this.limite = limite;
	}
	public CuentaLimite(double limite) {
		
		this.limite = limite;
	}
	public CuentaLimite() {
		limite=50; //limite por defecto si no se asigna ninguno
	}
	//extraemos si la cantidad es inferior al límite
	@Override
	public void extraer(double cantidad) {
		if(cantidad<limite) {
			super.extraer(cantidad);
		}
	}
	
	
	public void ajustarLimite() {
		limite=obtenerSaldo()/2;
	}
	
	
}
