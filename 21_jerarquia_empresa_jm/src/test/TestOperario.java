package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Empleado;
import model.Operario;
import service.EmpresaService;

class TestOperario {
	static EmpresaService service = new EmpresaService();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		
		// >30 años y nivel >2
		LocalDate fecha01 = LocalDate.of(2021, 9, 19);
		LocalDate fecha02 = LocalDate.of(2021,9, 17);
		LocalDate fecha03 = LocalDate.of(2021,9, 16); 		//30 meses dia 18/04/2024
		LocalDate fecha04 = LocalDate.of(2021,9, 19);
		LocalDate fecha05 = LocalDate.of(2021,9, 18);
		
		Empleado e01= new Operario("Pepe",30, fecha01, 100.0, 1); //0 condiciones
		Empleado e02= new Operario("Juan",30, fecha02, 100.0, 2);  //0 condiciones
		Empleado e03= new Operario("Mario",30, fecha03, 100.0, 3); // 1 condicion nivel
	
		Empleado e04= new Operario("Maria",31, fecha04, 100.0, 2); //1 condicion edad
		// Cumple dos condiciones
		Empleado e05= new Operario("Juana",31, fecha05, 100.0, 3); //2 condiciones
		e01.incentivar(); e02.incentivar(); e03.incentivar(); 
		e05.incentivar(); e04.incentivar(); 
		assertEquals(100.0, service.comprobarSalario((Empleado)e01));
		assertEquals(100.0, service.comprobarSalario((Empleado)e02));
		assertEquals(110.0, service.comprobarSalario((Empleado)e03));		
		assertEquals(110.0, service.comprobarSalario((Empleado)e04));
		assertEquals(120.0, service.comprobarSalario((Empleado)e05));
		
	}

}
