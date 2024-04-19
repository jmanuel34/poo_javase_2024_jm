package view;

import java.time.LocalDate;

import model.Director;
import service.EmpresaService;

public class Empresa {

	public static void main(String[] args) {
		EmpresaService service = new EmpresaService();
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
	}

}
