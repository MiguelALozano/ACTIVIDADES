/**
 * @author Miguel A Lozano
 *
 */

public class NumerosRojosException extends Exception{ // la excepción extiende de la clase base Exception
	
	// PROPIEDADES
	private static final long serialVersionUID = 1L; // necesario para evitar un warning de Eclipse
	private int nuevoAcum;
	
	
	// CONSTRUCTOR
	public NumerosRojosException() {
		super();
		this.nuevoAcum = 0;
	}

	public NumerosRojosException(int nuevoAcum) { // nos llega el objeto de la excepción desde el catch
		super("\n********** No dispone de puntos en su Tarjeta Feliz **********\n");
		this.nuevoAcum = nuevoAcum;
	}

	
	// METODOS
	@Override
	public String toString() {
		return "NumerosRojosException [La cantidad de puntos que tiene son: " + nuevoAcum + "]";
	}
	
}