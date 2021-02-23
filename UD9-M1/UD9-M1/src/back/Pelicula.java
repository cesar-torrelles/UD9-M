/**
 * 
 */
package back;

/**
 * @author Ingrid Dominguez, Vyacheslav Khaydorov, Cesar Torrelles
 *
 */
public class Pelicula {
	
	//Atributos
	private String titulo;
	private double duracion;
	private int edadMin;
	private String director;
	
	//Constructor
	public Pelicula(String titulo, double duracion, int edadMin, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMin = edadMin;
		this.director = director;
	}

	//Getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public int getEdadMin() {
		return edadMin;
	}

	public void setEdadMin(int edadMin) {
		this.edadMin = edadMin;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", duracion=" + duracion + ", edadMin=" + edadMin + ", director="
				+ director + "]";
	}

}
