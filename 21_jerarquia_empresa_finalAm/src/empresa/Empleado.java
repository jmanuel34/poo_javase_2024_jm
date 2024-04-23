package empresa;

import java.time.LocalDate;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@SuperBuilder
@Data
public abstract class Empleado {
	private String nombre;
	private int edad;
	private LocalDate fechaIngreso;
	private double salario;
	public static final int BONO=600;
	
	public abstract void incentivar();

	public Empleado(String nombre, int edad, LocalDate fechaIngreso, double salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.fechaIngreso = fechaIngreso;
		this.salario = salario;
	}
}
