package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import model.Cuenta;

public class CuentasService {
	List<Cuenta> cuentas=new ArrayList<Cuenta>(List.of(
			new Cuenta("ES1420800222823000247854",
		            "Fernando López Gómez", LocalDate.parse("2018-04-14"),
		            "EUR", Double.valueOf("125477.44")),
		    new Cuenta("ES3520800014523000687719",
		            "Marcos Pérez Sánchez", LocalDate.parse("1998-10-01"),
		            "EUR", Double.valueOf("9465.59")),		
		    new Cuenta("ES4720800136253000145866",
		            "Francisco González Fernández", LocalDate.parse("2000-11-03") ,
		            "JPY", 3258745.7),
		   new Cuenta("8747-369", "Kenji Nakamura",
				   LocalDate.parse("1984-06-17") , "JPY", 985471.4))); 
	
	// A partir de un numero de cuenta nos indica si existe o no esa cuenta
	public boolean existeCuenta(String cuenta) {
		return cuentas.stream()
				.anyMatch(n->n.getNumeroCuenta().equals(cuenta));
	}
	
	// A partir de un nombre de divisa nos dice cuantas cuentas hay de dicha divisa	
	public int contarDivisas(String divisa) {
		return (int)cuentas.stream()
					.filter(n->n.getDivisa().equals(divisa))
					.count();
	}
	
	// A partir de una fecha, nos indique cuentas cuentas se crearon a partir de esa fecha
	public int contarCuentasPorFecha(LocalDate fecha) {
		return (int)cuentas.stream()
				.filter(n->n.getFechaApertura().isAfter(fecha))
				.count();
	}
	
	//metodo que devuelva la cuenta asociado a un determinado numero
	public Cuenta buscarCuenta(int numero) {
		return cuentas.stream()
				.filter(c->c.getNumeroCuenta().equals(numero))  // Stream de objetos cuenta))
				.findFirst() // Optional<Cuenta)
				.orElse(null);
	}
	
	//metodo que devuelva la cuenta asociado a un determinado titular
	public Optional<Cuenta> buscarCuentaPorTitular(String nombre) {
		return cuentas.stream()
				.filter(c->c.getNumeroCuenta().equals(nombre))  // Stream de objetos cuenta))
				.findFirst(); // Optional<Cuenta)
	}
	
	// Método que devuelva la cuenta con menor saldo
	public Cuenta cuentaMenorSaldo() {
/*		return cuentas.stream()
				.sorted((a,b)->Double.compare(a.getSaldo(), b.getSaldo()))
				.findFirst()
				.orElse(null);
//*/
	/*	
		return cuentas.stream()
				.min((a,b)->Double.compare(a.getSaldo(), b.getSaldo()))
				.orElse(null);
		//*/
		return cuentas.stream()
				.min(Comparator.comparingDouble(c->c.getSaldo()))
				.orElse(null);
	}
	
	// Metodo que nos devuelba las cuentas de cada divisa
	public List<Cuenta> listaCuentasPorDivisa(String divisa) {
		return cuentas.stream()
				. filter(c->c.getDivisa().equals(divisa))
//				. collect(Collectors.toList());
				.toList();		//Versiones java 16 en adelante. Abreviatura del anterior
	}
	
	// metodo que devuelva un map con los numeros de cuenta como claves y saldos como valor
	public Map<String, Double> cuentasSaldos() {
		return cuentas.stream()
				.collect(Collectors.toMap(n->n.getNumeroCuenta(), n->n.getSaldo()));
	}
	
	// metodo que devuelve una tabla de cuentas agrupadas por divisa
	public Map<String, List<Cuenta> cuentasPorDivisa() {
		return cuentas.stream()
				.collect(Collectors.groupingBy(c->c.getDivisa()));
	}
}
