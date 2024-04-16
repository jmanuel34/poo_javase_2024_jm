package model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Movimiento {
	private double cantidad;
	LocalDateTime fechaHora;
	String tipo;
	
}
