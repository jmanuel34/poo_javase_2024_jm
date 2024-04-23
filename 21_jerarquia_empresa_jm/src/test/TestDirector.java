package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Director;
import model.Empleado;
/*
 * private String nombre;
	private int edad;
	private LocalDate fechaIngreso;
	private double salario;
 */

class TestDirector {
	
	@BeforeAll	
	static void setUpBeforeClass() throws Exception {
		
		
//		Director d01= new Director("Pepe",31, LocalDate.now(), 15000.0,"Marketing", 18);
//		Director d02= new Director("Juan",32, LocalDate.now(), 15000.0,"Marketing", 19);
//		Director d03= new Director("Mario",33, LocalDate.now(), 15000.0,"Marketing", 20);
//		Director d04= new Director("Maria",34, fecha01, 15000.0,"Marketing", 21);
//		Director d05= new Director("Juana",35, fecha02, 15000.0,"Marketing", 22);
		
		
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		// No cumplen condiciones
		LocalDate fecha01 = LocalDate.of(2022, 9, 19);
		LocalDate fecha02 = LocalDate.of(2021,9, 21);
		LocalDate fecha03 = LocalDate.of(2021,8, 16); 		//30 meses dia 18/04/2024
		LocalDate fecha04 = LocalDate.of(2022,9, 19);
		LocalDate fecha05 = LocalDate.of(2022,9, 21);
		LocalDate fecha06 = LocalDate.now().minusMonths(31);
		
		
		Director d01= new Director("Pepe",31, fecha01, 100.0,"Marketing", 18); // 0 condicion
		Director d02= new Director("Juan",32, fecha02, 100.0,"Marketing", 19); // 1 condicion fecha
		Director d03= new Director("Mario",33, fecha03, 100.0,"Marketing", 20); // 2 condicion fecha y empleados
	
		Director d04= new Director("Maria",34, fecha04, 100.0,"Marketing", 21); //1 condicion emp
		// Cumple dos condiciones
		Director d05= new Director("Juana",35, fecha05, 100.0,"Marketing", 22); // 2 condicion fecha/emp
		
		
		d01.incentivar(); d02.incentivar(); d03.incentivar();
		d04.incentivar(); d05.incentivar();
		
//		assertEquals(2000, director.getSalario());
		assertEquals(100.0, d01.getSalario());
		assertEquals(110.0, d02.getSalario());
		assertEquals(120.0, d03.getSalario());		
		assertEquals(110.0, d04.getSalario());
		assertEquals(110.0, d05.getSalario());
	}

}
