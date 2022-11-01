package app.curso.banco.main;

import java.util.Random;

import app.curso.banco.util.Utiles;

public class TestRandom {

	public static void main(String[] args) {

		// no olvidarse de importar Random más arriba
		Random random = new Random();

		// lista de Strings con valores
		String[] nombres = { "Juan", "Pedro", "Antonia", "Paco", "Irene" };

		String[] apellidos = { "Pérez", "Martín", "López", "Gómez", "Uta", "Lama" };

//		int indexNombre = random.nextInt(nombres.length);
//		String nombreAleatorio = nombres[indexNombre];
//
//		int indexApellido = random.nextInt(apellidos.length);
//		String apellidoAleatorio = apellidos[indexApellido];

		for (int i = 0; i < 10; i++) {
			String nombreAleatorio = Utiles.nombreAleatorio(Utiles.NOMBRES, apellidos);
			System.out.println(nombreAleatorio);
		}

//		System.out.println("Nombre completo aleatorio: " + nombreCompleto);

//		int enteroAleatorio = random.nextInt(100);
//		double decimalAleatorio = random.nextDouble(100);
//		boolean booleanoAleatorio = random.nextBoolean();
//		System.out.println("Entero aleatorio: " + enteroAleatorio);
//		System.out.println("Double aleatorio: " + decimalAleatorio);
//		System.out.println("Boolean aleatorio: " + booleanoAleatorio);
//		System.out.println("Index: " + index);
//		System.out.println("Nombre aleatorio: " + nombreAleatorio);
	}

}
