package view;

import curso.io.LectorTeclado;
import service.CuentaMovimientos;

public class GestorCuentas {

	/*
	 * public GestorCuentas() { // TODO Auto-generated constructor stub }
	 * Pide el saldo inicial y limite, después:
1.- Ingresar
2.- Extraer
3.- Saldo y movimientos
4.- Salir 
	 * 
	 */
	
	static CuentaMovimientos service = new CuentaMovimientos();
	public static void main(String[] args) {
		LectorTeclado lector = new LectorTeclado();
		int opcion=0;
		do {
			//presentar menu
			//leer opción y comprobar opcion elegida
			presentarMenu();
			try{
				opcion=lector.readInt();
				switch(opcion) {
					case 1:
						agregarCuenta();
						break;
					case 2:
						ingresar();
						break;
					case 3:
						extraer();
						break;
					case 4:
						saldo();
						break;
					case 5:
						System.out.println("Adios!");
						break;
					
					default:
						System.out.println("Opción no válida!");
				}
			}//end try
			catch(NumberFormatException ex) {
				System.out.println("Debe ser un valor numérico!!");
			}
		}while(opcion!=5);
			
	}
	static void presentarMenu() {
		System.out.println("""
				1.- Nueva Cuenta
				2.- Ingresar
				3.- Extraer
				4.- Saldo y movimientos
				5.- Salir
				
				""");
	}
	
	public static void agregarCuenta() {
		LectorTeclado lector = new LectorTeclado();
		System.out.println("Ingrese saldo inicial: ");
		Double saldo =lector.readDouble();
		System.out.println("Ingrese límite: ");
		Double limite = lector.readDouble();
		CuentaMovimientos cuenta = new CuentaMovimientos(saldo, limite);
	}
	
	public static void ingresar() {
		LectorTeclado lector = new LectorTeclado();
		System.out.println("Ingrese cantidad: ");
		Double cantidad =lector.readDouble();
		
	}

}
