package model;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/* 
 * Curso: nombre, tematica, precio, fechaInicio, fechaFin y lista de alumnos matriculados
 */
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Curso {
	private String nombre; 
	private String tematica;
	private double precio;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	List<Alumno> alumnos;
}
