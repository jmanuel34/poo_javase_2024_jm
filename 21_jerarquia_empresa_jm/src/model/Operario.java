package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
 * Será un subtipo de empleado que incluirá el siguiente atributo:
 nivel. Nivel de seguridad del operario, puede ser un valor entre 1 y 5.
Sobrescribirá el método incentivar(), de modo que haga lo siguiente:

Si tiene más de 30 años y su nivel es superior a 2, se le incrementará su salario con el doble del
bono. Si cumple solo una de las condiciones anteriores, se le incrementará su salario con el
bono y si no cumple ninguna, no se hará nada.

Dispondrá además de un método actualizarNivel(), que en caso de que el empleado lleve más
de dos años en la empresa se le subirá un nivel de seguridad. Si ya está en nivel 5 no se hará
nada
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Operario extends Empleado{
	private int nivel;
	
		public void incentivar() {
			if ( nivel>2 ) this.setSalario(this.getSalario()+this.getBONO());
			if (this.getEdad()>30) this.setSalario(this.getSalario()+this.getBONO());
		}
		
		public void actualizarNivel() {
			LocalDate hoy = LocalDate.now();
			int years=(int)ChronoUnit.YEARS.between(hoy, super.getFechaIngreso()) ;
			if ( years>2 ) this.setSalario(this.getSalario()+this.getBONO());
			if (personal>20) this.setSalario(this.getSalario()+this.getBONO());
		}
}
