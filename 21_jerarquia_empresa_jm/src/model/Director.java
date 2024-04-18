package model;
/*
 * Director
Será un subtipo de empleado que incluirá los atributos:
 departamento. Nombre del departamento del que es director
 personal. Número de personas a su cargo
Sobrescribirá el método incentivar(), de modo que haga lo siguiente:

Si el lleva más de 30 meses en la empresa y tiene más de 20 personas a su cargo, se le
incrementará su salario con el doble del bono. 
Si cumple solo una de las condiciones
anteriores, se le incrementará su salario con el bono y si no cumple ninguna, no se hará nada
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Director extends Empleado {

	private String departamento;
	private int personal;
	
	public void incentivar() {
		LocalDate hoy = LocalDate.now();
		long meses=ChronoUnit.MONTHS.between(hoy, super.getFechaIngreso()) ;
		if ( meses>30 ) this.setSalario(this.getSalario()+this.getBONO());
		if (personal>20) this.setSalario(this.getSalario()+this.getBONO());
	}
}
