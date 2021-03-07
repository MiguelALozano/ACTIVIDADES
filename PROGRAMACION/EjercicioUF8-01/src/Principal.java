/**
 * @author Miguel A Lozano
 *
 */

import java.util.Scanner;

public class Principal {

	public static void main(String args[]) throws NumerosRojosException {
	
		Scanner lector = new Scanner(System.in);
		System.out.println ("Vamos a insertar en su Tarjeta de Fidelización 50 puntos\n");
		CuentaBancaria miCuenta = new CuentaBancaria (38143, "Amelia González");
		
		try {
			miCuenta.agregarMovimiento("Puntos iniciales:", 50);
			System.out.println("Cuántos puntos va a utilizar: "); // Haremos 3 movimientos, este es el 1º
			int puntos;
			puntos = Integer.parseInt(lector.nextLine());
			miCuenta.agregarMovimiento("Uso de puntos,", -puntos);

			System.out.println("Cuántos puntos va a canjear: "); // 2º movimiento
			puntos = Integer.parseInt(lector.nextLine());
			miCuenta.agregarMovimiento("Uso de puntos,", -puntos);

			System.out.println("Cuántos puntos va a canjear: "); // 3º movimiento
			puntos = Integer.parseInt(lector.nextLine());
			miCuenta.agregarMovimiento("Uso de puntos,", -puntos);
			lector.close();
			
		} catch (NumberFormatException | NumerosRojosException e) {
			System.out.println(e.getMessage());
			System.out.println("No ha introducido correctamente el valor " + e.getClass().getName()); // error en caso de no introducir un valor correcto
//			System.out.println(e.toString());
	
		} finally {
			System.out.println("Gracias por confiar en nosotros\n"); // despedida formal con finally
		}
		
		
		System.out.println(miCuenta.listarMovimientos());
		System.out.println(miCuenta);
	
	
	}
}
