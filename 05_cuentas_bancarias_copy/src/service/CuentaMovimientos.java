package service;

import java.time.LocalDateTime;
import java.util.ArrayList;

import model.Movimiento;

public class CuentaMovimientos extends CuentaLimite {
	private ArrayList<Movimiento> movimientos=new ArrayList<>();
	
	public CuentaMovimientos(double saldo, double limite) {
		super(saldo,limite);
	}
	public ArrayList<Movimiento> obtenerMovimientos(){
		return movimientos;
	}
	@Override
	public void extraer(double cantidad) {
		Movimiento m=new Movimiento(cantidad, LocalDateTime.now(), "extracción");
		movimientos.add(m);
		super.extraer(cantidad);
	}
	@Override
	public void ingresar(double cantidad) {
		Movimiento m=new Movimiento(cantidad, LocalDateTime.now(), "ingreso");
		movimientos.add(m);
		super.ingresar(cantidad);
	}
	
	
}
