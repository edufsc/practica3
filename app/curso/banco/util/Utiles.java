package app.curso.banco.util;

import java.util.Random;

// aquí podemos añadir métodos auxiliares, que se reutilizarán en varias clases
// una clase Persona no debería tener un método tan genérico como obtener un nombre aleatorio, por eso no lo implementamos allí
// es mejor definir bien lo que debería ir en cada clase para que nuestra aplicación sea sólida y mantenible
public class Utiles {
	
	// static permite acceder desde la clase sin crear un objeto, final indica constante, las constantes se declaran en mayúsculas
	public static final String[] NOMBRES = { "Juan", "Antonia", "Paco", "Irene" };

	public static final String[] APELLIDOS = { "Pérez", "Martín", "López", "Gómez", "Uta", "Lama" };

	// obtener un nombre completo "aleatorio" a partir de dos listas
	public static String nombreAleatorio(String[] nombres, String[] apellidos) {
		
		// la clase random permite generar datos aleatorios de forma sencilla
		Random random = new Random();
		
		// obtenemos un entero aleatorio entre 0 y la longitud de la lista nombres
		int indexNombre = random.nextInt(nombres.length);
		// usamos el entero como índice para seleccionar un nombre de la lista
		String nombreAleatorio = nombres[indexNombre];

		int indexApellido = random.nextInt(apellidos.length);
		String apellidoAleatorio = apellidos[indexApellido];

		// cancatenamos
		String nombreCompleto = nombreAleatorio + " " + apellidoAleatorio;

		System.out.println(nombreCompleto);

		return nombreCompleto;
	}

	
	// podemos utilizar los atributos de esta misma clase para evitarnos los parámetros
	// código más reutilizable
	public static String nombreAleatorio() {
		return nombreAleatorio(NOMBRES, APELLIDOS);
	}

}
