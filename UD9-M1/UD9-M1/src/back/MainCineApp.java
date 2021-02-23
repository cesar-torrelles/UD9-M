/**
 * 
 */
package back;

/**
 * @author Ingrid Dominguez, Vyacheslav Khaydorov, Cesar Torrelles
 *
 */



public class MainCineApp {

	public static void main(String[] args) {
		//Creamos el cine y la pelicula
		Pelicula pelicula = new Pelicula ("Lucy", 1.35, 12, "Steven Spellverg");
		Cine cine = new Cine (pelicula.getTitulo(), 5);
		
		//Mostramos el cine y la pelicula por pantalla
		System.out.println(pelicula.toString());
		System.out.println(cine.toString());
        
		//Sentamos a los espectadores (pasamos cine y pelicula por parametros)
        Metodos.sentarEspectadores(cine, pelicula);
        
        //Mostramos como han quedado los asientos de la sala despues de asignar a los espectadores
        Metodos.mostrarAsientos(cine.sala);
        
	}

}
