package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
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
	
	
	
	//método que a partir de número de cuenta nos indica si existe o no dicha cuenta
	public boolean existeCuenta(String numeroCuenta) {
		return cuentas.stream()
		.anyMatch(c->c.getNumeroCuenta().equals(numeroCuenta));
	}
	//método que a partir de nombre de divisa, nos dice cuantas cuentas hay de dicha divisa
	public int cuentasPorDivisa(String divisa) {
		return (int)cuentas.stream()
				.filter(c->c.getDivisa().equalsIgnoreCase(divisa)) //Stream<Cuenta>
				.count();//long
	}
	//método que a partir de nombre de divisa, devuelva las cuentas que hay de dicha divisa
		public List<Cuenta> listaCuentasPorDivisa(String divisa) {
			return cuentas.stream()
					.filter(c->c.getDivisa().equalsIgnoreCase(divisa)) //Stream<Cuenta>
					//.collect(Collectors.toList());
					.toList();//desde Java 16
		}
	
	//método que a partir de una fecha, nos indique cuantas
	//cuentas se crearon a partir de dicha fecha
	public int contarCuentasDespuesFecha(LocalDate fecha) {
		return (int)cuentas.stream()
				.filter(c->c.getFechaApertura().isAfter(fecha))
				.count();
	}
	
	//método que devuelva la cuenta asociada a un determinado número
	public Cuenta buscarCuenta(String numero) {
		return cuentas.stream()
				.filter(c->c.getNumeroCuenta().equals(numero))//Stream<Cuenta>
				.findFirst()//Optional<Cuenta>
				.orElse(null);
	}
	//método que devuelva la cuenta asociada a un determinado titular
		public Optional<Cuenta> buscarCuentaPorTitular(String titular) {
			return cuentas.stream()
					.filter(c->c.getTitular().equals(titular))//Stream<Cuenta>
					.findFirst();//Optional<Cuenta>
					
		}
	//método que devuelva la cuenta con menor saldo
	public Cuenta cuentaMenorSaldo() {
		/*return cuentas.stream()
				.sorted((a,b)->Double.compare(a.getSaldo(), b.getSaldo()))
				.findFirst() //Optional<Cuenta>
				.orElse(null);*/
		
		/*return cuentas.stream()
				.min((a,b)->Double.compare(a.getSaldo(), b.getSaldo()))
				.orElse(null);*/
		
		return cuentas.stream()
				.min(Comparator.comparingDouble(c->c.getSaldo()))
				.orElse(null);
	}
	
	//método que devuelva un Map con los números de cuenta como claves, y
	//saldo como valor
	public Map<String,Double> cuentasSaldos(){
		return cuentas.stream()
				.collect(Collectors.toMap(c->c.getNumeroCuenta(), c->c.getSaldo()));
	}
	
	//método que devuelve una tabla de cuentas agrupadas por divisa:
	public Map<String,List<Cuenta>> cuentasPorDivisa(){
		return cuentas.stream()
				.collect(Collectors.groupingBy(c->c.getDivisa()));
	}
	
}
