package app.curso.banco.util;

import java.lang.Math;

public class Utiles {

	// calcula un número aleatorio entre max y min y lo devuelve como entero
	public static int getRandom(int max, int min) {
		return (int) Math.random() * (max - min + 1) + min;
	}

}
