package service;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import model.Alumno;
import model.Curso;

public class FormacionService extends Curso {
	List<Curso> cursos=new ArrayList<>(List.of(
			new Curso("Java","Programación",120,LocalDate.of(2014, 11, 10),LocalDate.of(2015, 1, 30),
					List.of(new Alumno("a1",5.6),new Alumno("a2",8),
							new Alumno("a8",6),new Alumno("b7",4))),
			new Curso("Angular","Programación",80,LocalDate.of(2021, 06, 10),LocalDate.of(2021, 9, 8),
					List.of(new Alumno("r2",3.6), new Alumno("a9",7),new Alumno("b4",5))),
			new Curso("HTML y CSS","Web",60,LocalDate.of(2019, 03, 15),LocalDate.of(2019, 5, 30),List.of(new Alumno("r9",4),
					new Alumno("v4",6),new Alumno("h1",3),new Alumno("s9",5),new Alumno("k2",2))),
			new Curso("Oracle","Bases de datos",100,LocalDate.of(2020, 10, 20),LocalDate.of(2021, 2, 12),List.of(new Alumno("s10",9),
					new Alumno("r1",4))),
			new Curso("SQL","Bases de datos",40,LocalDate.of(2018, 02, 06),LocalDate.of(2018, 4, 20),List.of(new Alumno("y6",7),
					new Alumno("u7",2),new Alumno("b8",4),new Alumno("t2",6))),
			new Curso("Python","Programación",90,LocalDate.of(2016, 10, 23),LocalDate.of(2017, 3, 30),List.of(new Alumno("l9",7.6),
					new Alumno("g5",3),new Alumno("n1",8.4),new Alumno("x6",5.9)))
			
			)); 
	//añade un nuevo curso si no coinciden mismo nombre y fecha de inicio

		public boolean agregarCurso(Curso curso) {
/*			if (!cursos.contains(curso)) {
				cursos.add(curso);
				return true;
			} //*/
			if ( 
				cursos.stream().anyMatch(c->c.getNombre().equals(curso.getNombre() &&
					c.getFechaInicio().equals(curso.getFechaInicio())))) {
					cursos.add(curso);
					return true;
				}
			return false;
		}
		
		//precio medio de cursos por temática
		public double precioMedio(String tema) {
					return cursos.stream()
						.filter(c->c.getTematica().equalsIgnoreCase(tema))
//
						.collect(Collectors.averagingDouble(c->c.getPrecio()));
//						.mapToDouble(n->n.getPrecio())     //DoubleStream
//						.average()
//						.orElse(0.0);
		}
		//total cursos finalizados antes de determinada fecha
		public int totalCursosFinFecha(LocalDate fecha) {
			return (int)cursos.stream()
					.filter(c->c.getFechaFin().isBefore(fecha))
					.count();
		}
		
		//lista de cursos de la temática recibida como parámetro
		public List<Curso> listaCursosTema(String tema) {
			return cursos.stream()
					.filter(c->c.getTematica().equals(tema))  // Stream de objetos Curso))
					.toList();						// Desde java 17
			//	.collect(Collectors.toList());		// Antes de java 17
		}
			
		//conjunto de tematicas
		public Set<String> listaTematicas() {
			return cursos.stream()
					.map(c->c.getTematica())    //Stream<String>
					.collect(Collectors.toSet());					
		}
		 
		//lista de cursos cuyos precios se encuentran entre los dos valores recibidos como parámetros
		public List<Curso> cursosPorPrecio(double precio1, double precio2) {
			return cursos.stream()
					.filter(c->c.getPrecio()>precio1 && c.getPrecio()<precio2)
					.toList();
		}
		
		//lista de cursos cuya duración sea inferior a los meses que se reciben como parámetro
		 public List<Curso> cursosDuracionInferior( int duracion) {
			 return cursos.stream()
					 .filter(c->c.getFechaFin().minusMonths(duracion).isBefore(c.getFechaInicio()))
					 .collect(Collectors.toList());
		 }
		 
		//Tabla de cursos, donde la clave sea la duración del curso(en meses) y el valor el nombre del curso
		 
		 public Map<Integer, String> tablaNombres() {
//			 Map<Integer, String> tablaDiracionCursos =
					return cursos.stream()
					 .collect(Collectors.toMap(c->(int)Period.between(c.getFechaInicio(), getFechaFin()).toTotalMonths(), Curso::getNombre));
		 }
		//Tabla de cursos, donde la clave sea la duración del curso(en meses) y el valor la lista de cursos con dicha duración
		 public Map<Integer, String> tablaListaCursos() {
			 return cursos.stream()
					 .collect(Collectors.groupingBy(c->(int)Period.between(c.getFechaInicio(), getFechaFin()).toTotalMonths()));
	
		 }
		 
		 //tabla con los cursos divididos entre caros y baratos. Caros, los que superen el precio recibido como parámetro
		 //baratos los que no lo superen o lo igualen
		
		 public Map<Boolean, List<Curso>> divisionPorprecio(double precio) {
			 return cursos.stream()
					 .collect(Collectors.partitioningBy(c->c.getPrecio()<precio));
		 }
		 //cadena con los nombres de todos los cursos, separados por una coma
		 public String nombresCursos() {
			 return cursos.stream()   //Stream<Curso>
					 .map(c->c.getNombre())
					 .collect(Collectors.joining(","));
		 }
		 
		 // nota media de un curso
		 public double mediaCurso(String curso) {
/*			 return cursos.stream()		//Stream<Curso>
					 .filter(c->c.getNombre().equals(curso))	//Stream<Curso>
					 .findFirst()								//Optional<Curso>
					 .orElse(null)								//Curso
					 .getAlumnos()
					 .stream()
					 .collect(Collectors.averagingDouble(a->a.getNota()));   	//double  //*/
			 return cursos.stream()		//Stream<Curso>
					 .filter(c->c.getNombre().equals(curso))	//Stream<Curso>
					 .flatMap(c->c.getAlumnos().stream())	//Stream<Alumno>
					/* .map(c->c.getAlumnos())   //Stream<List<Alumno>>
					 .map(l->l.stream())   //Stream<Alumno>  */
					 .collect(Collectors.averagingDouble(a->a.getNota()));
		 }
		 //lista con los nombres de todos los alumnos
		 
		 public List<Alumno> listaAlumnos() {
/*			 
		 	return cursos.stream()	         //Stream<Curso>	
		 			.flatMap(c->c.getAlumnos().stream())   //Stream<Alumno>
		 			.map(a->a.getNombre())   //Stream<String>
		 			.toList();
//*/		return cursos.stream()
					.flatMap(c->c.getAlumnos().stream())
					.map(a->a.getNombre())
					.toList();
		 }
		 //lista de alumnos matriculados en cursos de determinada temática
		 
		 //alumno con mayor nota
		 
		 

}
