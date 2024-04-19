package model;

/*
 * Director
 * Será un subtipo de empleado que incluirá los atributos:
 * - departamento. Nombre del departamento del que es director
 * - personal. Número de personas a su cargo
 * 
 * Sobrescribirá el método incentivar(), de modo que haga lo siguiente:
 * Si el lleva más de 30 meses en la empresa y tiene más de 20 personas a su cargo, 
 * se le incrementará su salario con el doble del bono.
 *  
 * Si cumple solo una de las condiciones anteriores, se le incrementará 
 * su salario con el bono y si no cumple ninguna, no se hará nada 
 * 
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
@NoArgsConstructor
@AllArgsConstructor
@Data
//*/
public class Director extends Empleado {

	private String departamento;
	private int personal;
	
	public Director() {
		super();
	}

	public Director(String nombre, int edad, LocalDate fechaIngreso, double salario,
					String departamento, int personal) {
		super(nombre, edad, fechaIngreso, salario);
		this.departamento = departamento;
		this.personal = personal;
	}

	@Override
	public void incentivar() {
		long meses = ChronoUnit.MONTHS.between(getFechaIngreso(), LocalDate.now());
		if (meses > 30)
			setSalario(getSalario() + getBONO());
		if (personal > 20)
			setSalario(getSalario() + getBONO());
	}
}
