/**
 * 
 */
package back;

/**
 * @author Ingrid Dominguez, Vyacheslav Khaydorov, Cesar Torrelles
 *
 */
public class Espectador {

	//Atributos
	private String nombre;
	private int edad;
	private double dinero;
	
	//Constructor
	public Espectador(String nombre, int edad, double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}
	
	//Getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getDinero() {
		return dinero;
	}
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	
	 public boolean tieneEdad(int edadMinima) {
	        return edad >= edadMinima;
	}
	 
	 public boolean tieneDinero(double precioEntrada) {
	        return dinero >= precioEntrada;
	 }
		
	//toString
	@Override
	public String toString() {
		return "Espectador [nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + "]";
	}

}
