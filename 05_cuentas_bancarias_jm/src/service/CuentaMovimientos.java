package service;
/*
 * Clase CuentaMovimientos
Clase que hereda CuentaLimite. 
Incopora un nuevo método obtenerMovimientos
que devolverá un ArrayList con los movimientos realizados
en la cuenta
Cada movimiento se define por: cantidad, fechaHora, tipo 
(ingreso o extracción)
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import model.Movimiento;

public class CuentaMovimientos extends CuentaLimite {

	ArrayList<Movimiento> movimientos = new ArrayList<>();

	public CuentaMovimientos() {	
	}

	public CuentaMovimientos(double saldo, double limite) {
		super(saldo, limite);
	}

	@Override
	public void extraer(double cantidad) {
		Movimiento mov = new Movimiento(cantidad, LocalDateTime.now(), "extraccion");
		movimientos.add(mov);
		super.extraer(cantidad); 
	}

	@Override
	public void ingresar(double cantidad) {
		Movimiento mov = new Movimiento(cantidad, LocalDateTime.now(), "ingreso");
		movimientos.add(mov);
		super.ingresar(cantidad);
	}
	
	public ArrayList<Movimiento> obtenerMovimientos() {
		return movimientos;
	}
/*	
	public String toString() {
		return """
				{"cantidad" : %s, "fechaHora" : "%s", "tipo" : "%s"}""".stripIndent().formatted(this.obtenerSaldo(), 
						+ fechaHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH🇲🇲ss")), tipo);
	}
//*/ 
}
