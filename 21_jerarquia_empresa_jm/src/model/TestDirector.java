package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import service.EmpresaService;
/*
 * private String nombre;
	private int edad;
	private LocalDate fechaIngreso;
	private double salario;
 */

class TestDirector {
//	static Director dir=new Director();
	static EmpresaService service = new EmpresaService();
	
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
		LocalDate fecha01 = LocalDate.of(2021, 9, 19);
		LocalDate fecha02 = LocalDate.of(2021,9, 17);
		LocalDate fecha03 = LocalDate.of(2021,9, 16); 		//30 meses dia 18/04/2024
		LocalDate fecha04 = LocalDate.of(2021,9, 19);
		LocalDate fecha05 = LocalDate.of(2021,9, 18);
		
		Director d01= new Director("Pepe",31, fecha01, 100.0,"Marketing", 18); // 0 condicion fecha
		Director d02= new Director("Juan",32, fecha02, 100.0,"Marketing", 19); // 1 condicion fecha
		Director d03= new Director("Mario",33, fecha03, 100.0,"Marketing", 21); // 2 condicion fecha y empleados
	
		Director d04= new Director("Maria",34, fecha04, 100.0,"Marketing", 21); //1 condicion emp
		// Cumple dos condiciones
		Director d05= new Director("Juana",35, fecha05, 100.0,"Marketing", 22); // 2 condicion fecha/emp
		
		
		d01.incentivar(); d02.incentivar(); d03.incentivar();
		d04.incentivar(); d05.incentivar();
		
		assertEquals(100.0, service.comprobarSalario((Empleado)d01));
		assertEquals(110.0, service.comprobarSalario((Empleado)d02));
		assertEquals(120.0, service.comprobarSalario((Empleado)d03));		
		assertEquals(110.0, service.comprobarSalario((Empleado)d04));
		assertEquals(120.0, service.comprobarSalario((Empleado)d05));
		
	}

}
