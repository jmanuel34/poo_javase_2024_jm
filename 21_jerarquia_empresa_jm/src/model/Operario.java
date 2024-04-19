package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
 * Será un subtipo de empleado que incluirá el siguiente atributo:
 * nivel. Nivel de seguridad del operario, puede ser un valor entre 1 y 5. 
 * 
 * Sobrescribirá el método incentivar(), de modo que haga lo siguiente:
 * 
 * Si tiene más de 30 años y su nivel es superior a 2, se le incrementará su 
 * salario con el doble del bono. 
 * Si cumple solo una de las condiciones anteriores, se le incrementará su 
 * salario con el bono y si no cumple ninguna, no se hará nada.
 * 
 * Dispondrá además de un método actualizarNivel(), que en caso de que el 
 * empleado lleve más de dos años en la empresa se le subirá un nivel de seguridad. 
 * Si ya está en nivel 5 no se hará nada.
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
@NoArgsConstructor
@AllArgsConstructor
@Data
*/
public class Operario extends Empleado {
	private int nivel;
	
	public Operario() {
		super();
	}
	
	public Operario(String nombre, int edad, LocalDate fechaIngreso, double salario,int nivel) {
		super(nombre, edad, fechaIngreso, salario);
		this.nivel = nivel;
	}

	@Override
	public void incentivar() {
		if (getEdad() > 30)	setSalario(getSalario() + getBONO());
		if (nivel > 2) setSalario(getSalario() + getBONO());
	}

	public void actualizarNivel() {
		LocalDate hoy = LocalDate.now();
		int antiguedad = (int) ChronoUnit.YEARS.between(hoy, super.getFechaIngreso());
		if (antiguedad > 2 && nivel <= 5)
			nivel++;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
}
