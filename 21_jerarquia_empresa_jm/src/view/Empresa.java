package view;

import java.time.LocalDate;

import model.Empleado;
import model.Operario;

public class Empresa {

	public static void main(String[] args) {
//		EmpresaService service = new EmpresaService();
/*
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
		System.out.println(service.comprobarSalario(d01));
		System.out.println(service.comprobarSalario(d02));
		System.out.println(service.comprobarSalario(d03));
		System.out.println(service.comprobarSalario(d04));
		System.out.println(service.comprobarSalario(d05));
//*/
		LocalDate fecha00 = LocalDate.of(2021, 8, 18);
		
		LocalDate fecha01 = LocalDate.of(2021, 9, 19);
		LocalDate fecha02 = LocalDate.of(2021,9, 17);
		LocalDate fecha03 = LocalDate.of(2021,9, 16); 		//30 meses dia 18/04/2024
		LocalDate fecha04 = LocalDate.of(2021,9, 19);
		LocalDate fecha05 = LocalDate.of(2021,9, 18);
		
		Empleado test= new Operario("Pepe",30, fecha00, 100.0, 1); //0 condiciones

		Empleado e01= new Operario("Pepe",30, fecha01, 100.0, 1); //0 condiciones
		Empleado e02= new Operario("Juan",30, fecha02, 100.0, 2);  //0 condiciones
		Empleado e03= new Operario("Mario",30, fecha03, 100.0, 3); // 1 condicion nivel
	
		Empleado e04= new Operario("Maria",31, fecha04, 100.0, 2); //1 condicion edad
		// Cumple dos condiciones
		Empleado e05= new Operario("Juana",31, fecha05, 100.0, 3); //2 condiciones
//		e01.ac
		
	}

}
