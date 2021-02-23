/**
 * 
 */
package back;

/**
 * @author Ingrid Dominguez, Vyacheslav Khaydorov, Cesar Torrelles
 *
 */
public class Cine {

	//Atributos
	private String pelicula;
	private double precioEntrada;
	protected Asientos [][] sala; 
	
	//Constructor
	public Cine(String pelicula, double precioEntrada) {
		this.pelicula = pelicula;
		this.precioEntrada = precioEntrada;
		this.sala= new Asientos [5][9]; 
		Metodos.rellenaButacas(sala);
		Metodos.mostrarAsientos(sala);
	}

	//Getters y setters
	public String getPelicula() {
		return pelicula;
	}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}

	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	public Asientos[][] getSala() {
		return sala;
	}

	public void setSala(Asientos[][] sala) {
		this.sala = sala;
	}
	
	@Override
	public String toString() {
		return "Cine [pelicula=" + pelicula + ", precioEntrada=" + precioEntrada + "]";
	}
	
}
