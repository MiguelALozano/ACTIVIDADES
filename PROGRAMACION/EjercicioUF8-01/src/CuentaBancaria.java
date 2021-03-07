/**
 * @author Miguel A Lozano
 *
 */

import java.util.ArrayList;

public class CuentaBancaria {

	//PROPIEDADES
	private int numeroCuenta;
	private String cliente;
	private int saldo;
	private ArrayList<Movimiento> movimientos;
	private int disponible;

	// CONSTRUCTOR
	public CuentaBancaria() {
		this.numeroCuenta = 0;
		this.cliente = "";
		this.saldo = 0;
		this.movimientos = new ArrayList();
	}

	public CuentaBancaria(int numeroCuenta, String cliente) {
		this.numeroCuenta = numeroCuenta;
		this.cliente = cliente;
		this.saldo = 0;
		this.movimientos = new ArrayList();
	}

	// METODOS
	public void agregarMovimiento(String concepto, int cantidad) throws NumerosRojosException {
		this.saldo = this.saldo + cantidad;
		disponible = this.saldo - cantidad;
		if (this.saldo<0) {
			System.out.println("Puntos disponibles " + disponible);
			throw new NumerosRojosException(this.saldo);
		} else
			this.movimientos.add(new Movimiento(concepto, cantidad, saldo));
	}
	
	public String listarMovimientos() {
		String listado = "";
		for (Movimiento mov : this.movimientos) {
			listado = listado + mov.toString()+"\n";
		}                          
		return listado;
	}

	@Override
	public String toString() {
		return "Número Tarjeta: " + this.numeroCuenta + ", Cliente: " + this.cliente + ", Puntos Totales= " + this.saldo;
	}
}