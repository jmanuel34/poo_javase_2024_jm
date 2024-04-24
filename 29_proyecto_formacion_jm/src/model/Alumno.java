package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Alumno: nombre y nota
 * Curso: nombre, tematica, precio, fechaInicio, fehcaFin y lista de alumnos matriculados
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Alumno {
	private String nombre;
	private double nota;
}
