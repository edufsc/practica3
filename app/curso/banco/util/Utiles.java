package app.curso.banco.util;

import java.util.Random;

// aqu� podemos a�adir m�todos auxiliares, que se reutilizar�n en varias clases
// una clase Persona no deber�a tener un m�todo tan gen�rico como obtener un nombre aleatorio, por eso no lo implementamos all�
// es mejor definir bien lo que deber�a ir en cada clase para que nuestra aplicaci�n sea s�lida y mantenible
public class Utiles {
	
	// static permite acceder desde la clase sin crear un objeto, final indica constante, las constantes se declaran en may�sculas
	public static final String[] NOMBRES = { "Juan", "Antonia", "Paco", "Irene" };

	public static final String[] APELLIDOS = { "P�rez", "Mart�n", "L�pez", "G�mez", "Uta", "Lama" };

	// obtener un nombre completo "aleatorio" a partir de dos listas
	public static String nombreAleatorio(String[] nombres, String[] apellidos) {
		
		// la clase random permite generar datos aleatorios de forma sencilla
		Random random = new Random();
		
		// obtenemos un entero aleatorio entre 0 y la longitud de la lista nombres
		int indexNombre = random.nextInt(nombres.length);
		// usamos el entero como �ndice para seleccionar un nombre de la lista
		String nombreAleatorio = nombres[indexNombre];

		int indexApellido = random.nextInt(apellidos.length);
		String apellidoAleatorio = apellidos[indexApellido];

		// cancatenamos
		String nombreCompleto = nombreAleatorio + " " + apellidoAleatorio;

		System.out.println(nombreCompleto);

		return nombreCompleto;
	}

	
	// podemos utilizar los atributos de esta misma clase para evitarnos los par�metros
	// c�digo m�s reutilizable
	public static String nombreAleatorio() {
		return nombreAleatorio(NOMBRES, APELLIDOS);
	}

}
