package model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Empleado {
	private final double BONO=5;
	
	private String nombre;
	private int edad;
	private LocalDate fechaIngreso;
	private double salario;
	
	public void incentivar() {}
}
