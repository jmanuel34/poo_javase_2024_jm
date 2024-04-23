package empresa;

import java.time.LocalDate;
import java.time.Period;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
@NoArgsConstructor
@Setter
@Getter
public class Director extends Empleado {
	private String departamento;
	private int personal;
	public Director(String nombre, int edad, LocalDate fechaIngreso, double salario, String departamento,
			int personal) {
		super(nombre, edad, fechaIngreso, salario);
		this.departamento = departamento;
		this.personal = personal;
	}
	@Override
	public void incentivar() {
		Period period=Period.between(getFechaIngreso(), LocalDate.now().plusDays(1));
		if(period.toTotalMonths()>30&&this.getPersonal()>20) {
			this.setSalario(this.getSalario()+2*Empleado.BONO);
		}else if(period.toTotalMonths()>30||this.getPersonal()>20) {
			this.setSalario(this.getSalario()+Empleado.BONO);
		}

	}

	

	

}
