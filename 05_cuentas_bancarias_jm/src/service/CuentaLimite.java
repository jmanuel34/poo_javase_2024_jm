package service;

/*
 * clase CuentaLimite
Clase que hereda Cuenta. Incorporará un atributo "limite",
para limitar la extracción a dicho valor.
Además, añadiremos un método ajustarLimite(), que fijará el límite
en la mitad del saldo 
 */
public class CuentaLimite extends Cuenta {
	private double limite;

	public CuentaLimite() {
		limite = 50;
//		limite = obtenerSaldo() / 2;
	}

	public CuentaLimite(double saldo, double limite) {
		super(saldo);
		this.limite = limite;
	}

	public void ajustarLimite(double cantidad) {
		limite = obtenerSaldo()/2;
//		if(cantidad <= limite) {
//			limite = cantidad;
	}


	@Override
	public void extraer(double cantidad) {
		// TODO Auto-generated method stub
		if (cantidad < limite)
			super.extraer(cantidad);
	
	}
	

}

/*

Os dejo el tostring en json: @Override
	public String toString() {
		return """
				{"cantidad" : %s, "fechaHora" : "%s", "tipo" : "%s"}""".stripIndent().formatted(cantidad, fechaHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH🇲🇲ss")), tipo);
	} 
*/