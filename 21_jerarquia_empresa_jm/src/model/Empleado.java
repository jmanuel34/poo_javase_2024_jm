package model;

/* 
 * Es la clase padre
 * Contiene los atributos contiene los atributos 
 * - nombre: Nombre del empleado 
 * - edad: Edad del empleado
 * - fechaIngreso. Fecha en la que ingresó en la empresa
 * - salario. Salario anual
 * Además de los constructores y métodos setter/getter, incluirá un método abstracto llamado
 * incentivar(), que no devolverá ningún resultado ni recibirá ningún parámetro.
 * También incluirá una constante doble llamada BONO, con un valor predefinido. 
 * 
 */

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
@NoArgsConstructor
@AllArgsConstructor
@Data
//*/
public class Empleado {

	private final double BONO = 10;

	private String nombre;
	private int edad;
	private LocalDate fechaIngreso;
	private double salario;

	public Empleado() {
		super();
	}

	public Empleado(String nombre, int edad, LocalDate fechaIngreso, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.fechaIngreso = fechaIngreso;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getBONO() {
		return BONO;
	}

	public void incentivar() {
	}
}
