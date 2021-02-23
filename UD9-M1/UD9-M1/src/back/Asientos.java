/**
 * 
 */
package back;

/**
 * @author Ingrid Dominguez, Vyacheslav Khaydorov, Cesar Torrelles
 *
 */
public class Asientos {
	
	//Atributos
	private int numFila;
	private char letra;
	private boolean libre;
	
	//Constante 
	private final boolean libre_DEF = true;
	
	//Constructor
	public Asientos(int numFila, char letra) {
		this.numFila = numFila;
		this.letra = letra;
		this.libre = libre_DEF;
	}
	
	//Getters y setters
	public int getNumFila() {
		return numFila;
	}

	public void setNumFila(int numFila) {
		this.numFila = numFila;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public boolean isLibre() {
		return libre;
	}

	public void setLibre(boolean libre) {
		this.libre = libre;
	}

	@Override
	public String toString() {
		if (libre) {
		return "Asiento: " + numFila + letra + " está vacío.";
		}
		else {
			return "Asiento: " + numFila + letra + " está ocupado.";
		}
	}

}
