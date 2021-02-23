/**
 * 
 */
package back;

import java.util.Random;	//Para generar num aleatorios

/**
 * @author Ingrid Dominguez, Vyacheslav Khaydorov, Cesar Torrelles
 *
 */
public class Metodos {
	
	//Metodo con los espectadores pregenerados, les damos una cantidad de dinero al azar
	public static Espectador[] generarEspectadores() {		//Devolvemos el vector para tener acceso a los espectadores
		Espectador [] espectadores = new Espectador [10];
        espectadores[0] = new Espectador("Julio", 12, Metodos.dineroAleatorio(1, 20));
        espectadores[1] = new Espectador("Maria", 20, Metodos.dineroAleatorio(1, 20) );
        espectadores[2] = new Espectador("David", 22, Metodos.dineroAleatorio(1, 20));
        espectadores[3] = new Espectador("Ignacio", 16, Metodos.dineroAleatorio(1, 20));
        espectadores[4] = new Espectador("Julia", 10, Metodos.dineroAleatorio(1, 20));
        espectadores[5] = new Espectador("Carla", 8, Metodos.dineroAleatorio(1, 20));
        espectadores[6] = new Espectador("Mercedes", 34, Metodos.dineroAleatorio(1, 20));
        espectadores[7] = new Espectador("José", 41, Metodos.dineroAleatorio(1, 20));
        espectadores[8] = new Espectador("Carlos", 27, Metodos.dineroAleatorio(1, 20));
        espectadores[9] = new Espectador("Joaquin", 19, Metodos.dineroAleatorio(1, 20));
        
        return espectadores;
        
	}
	
	
	//Metodo para calcular de manera aleatoria el dinero de los espectadores
	public static double dineroAleatorio(double minimo, double maximo) {
		
		//Variables
		Random aleatorizador = new Random();	//Para generar num aleatorios
		double num = aleatorizador.nextDouble() * (maximo - minimo);
		
		//Lo dejamos en dos decimales
		num = Math.round(num * 100);	
		num = num / 100;
		
		return num;
	}
	
	  
	  //Metodo para asignar los asientos al vector bidemensional sala
	  public static void rellenaButacas(Asientos [][] sala) {
		 int fila = sala.length;
	        for (int i = 0; i < sala.length; i++) {
	            for (int j = 0; j < sala[0].length; j++) {
	                //Recuerda que los char se pueden sumar
	                sala[i][j] = new Asientos(fila, (char) ('A' + j));
	            }
	            fila--; //Decremento la fila para actualizar la fila
	        }
	  }
	  
	  
	  //Metodo para mostrar los asientos
	  public static void mostrarAsientos(Asientos[][] sala) {
	        for (int i = 0; i < sala.length; i++) {
	            for (int j = 0; j < sala[0].length; j++) {
	                System.out.println(sala[i][j]);				//Cómo hace la llamada al toString esto?
	            }
	            System.out.println("");
	        }

	   }
	  
	  
	  //Método para asignar a los espectadores de nuestrosEspectadores a los asientos de cine al azar
	  public static void sentarEspectadores(Cine cine, Pelicula pelicula) {
		  
		  //Variables
		  boolean sentado = false, salaLlena = false;
		  Random aleatorizador = new Random();	//Para generar num aleatorios
		  int fila, columna;
		  int asientosLibres = cine.sala.length * cine.sala[0].length;
		  
		  //Conseguimos los espectadores
		  Espectador[] nuestrosEspectadores = Metodos.generarEspectadores();
		  
		  //Recorremos el vector de espectadores
		  for (Espectador espect : nuestrosEspectadores) {
			  if (!salaLlena) {		//Comprobamos que la sala no esté llena
				  //Por cada espectador del vector...
				  if (espect.tieneEdad(pelicula.getEdadMin()) && espect.tieneDinero(cine.getPrecioEntrada())) {	//Comprobamos edad superior a edad mínima y dinero suficiente
					  sentado = false;
					  do {
						  //Generamos dos valores aleatorios
						  fila = aleatorizador.nextInt(cine.sala.length);
						  columna = aleatorizador.nextInt(cine.sala[0].length);	//Asignamos los valores usados en la creacion del objeto cine
						  if (cine.sala[cine.sala.length - (fila + 1)][columna].isLibre() == true) {	//El bucle para asignar las filas es inverso
							  cine.sala[cine.sala.length - (fila + 1)][columna].setLibre(false);
							  sentado = true;
							  asientosLibres -= 1;
						  }
					  } while (!sentado);
					  //Salida por pantalla
					  System.out.println("\n" + espect.getNombre() + " se sienta en el asiento " + (fila + 1) + (char)('A' + columna));	//fila es la ubicacion en el vector
					  																												//y la columna va en letras
				  }
				  else if (!espect.tieneEdad(pelicula.getEdadMin()))
					  System.out.println("\n" + espect.getNombre() + ", de " + espect.getEdad() + " años, no puede entrar a ver esta "
					  		+ "pelicula porque no llega a la edad mínima de la pelicula (" + pelicula.getEdadMin() + ").");
				  else
					  System.out.println("\n" + espect.getNombre() + " no puede entrar a ver esta pelicula porque no puede pagar la "
					  		+ "entrada.\nPrecio entrada: " + cine.getPrecioEntrada() + "\nDinero del espectador: " + espect.getDinero());
			  }
			  if (asientosLibres == 0) {					//Si no quedan asienos libres ponemos salaLlena a true
				  salaLlena = true;
				  System.out.println("La sala está llena!");
			  }
		  }
		  
		  //Mostramos cuantos asientos libres quedan en la sala
		  System.out.println("\nQuedan " + asientosLibres + " asientos libres en la sala\n");
		  
	  }

}
