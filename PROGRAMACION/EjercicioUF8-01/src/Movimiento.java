/**
 * 
 */

/**
 * @author Miguel A Lozano
 *
 */

import java.time.LocalDateTime;

public class Movimiento {

	// PROPIEDADES
	private LocalDateTime fecha;
	private String concepto;
	private double cantidad;
	private int saldo;

	// CONSTRUCTOR
	public Movimiento() {
		this.concepto = "";
		this.cantidad = 0;
		this.saldo = 0;
		this.fecha = LocalDateTime.now();
	}
	 
	public Movimiento(String concepto, int cantidad, int saldo) {
		this.concepto = concepto;
		this.cantidad = cantidad;
		this.saldo = saldo;
		this.fecha = LocalDateTime.now();
	}

	// GETTERS SETTERS
	public int getSaldo() {
		return this.saldo;
	}
	
	//METODOS
	@Override
	public String toString() {
		return fecha + " -- Concepto: " + concepto + " \tCantidad = " + cantidad + " \tPuntos en tarjeta = " + saldo;
	}

}
