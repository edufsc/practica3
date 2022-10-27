package app.curso.banco.main;

import java.util.ArrayList;

public class TestColecciones {

	public static void main(String[] args) {

		// Colecciones

		// ArrayList -> Listas
		// HashMap -> Claves-Valor {key: value}

//		long numero;
//		Long numero2;
//		boolean booleano;
//		Boolean booleano2;
//		int entero;
//		Integer entero2;

		// crear un ArrayList de n�meros enteros del 0 al 20
		// a�adiendo cada n�mero en su posici�n

		System.out.println("Rellenar lista");
		ArrayList<Integer> numeros = new ArrayList<>();

		for (int i = 0; i <= 20; i++) {
			numeros.add(i);
			System.out.println(numeros);
		}

		System.out.println(numeros);

		System.out.println("Imprimir n�meros");

		for (int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}

		System.out.println("Eliminar n�meros");

		int listaSize = numeros.size();

		for (int i = 0; i < listaSize; i++) {
			numeros.remove(0);
		}

		System.out.println(numeros);

		// nuevo ArrayList de enteros
		ArrayList<Integer> lista = new ArrayList<>();
		
		// vaciar lista
		lista.clear();

		// iterar ArrayList sin tener en cuenta posiciones
		for (Integer numero : lista) {
			System.out.println(numero);
		}

		// a�adir elemento al final
//		lista.add(3);

		// a�adir n�mero 5 en la posici�n 3
//		lista.add(3, 5);

		// tama�o de la lista
//		lista.size();

		// eliminar elemento
//		lista.remove(3);

		// buscar �ndice de un elemento (si no est� devuelve -1)
//		lista.indexOf(3);

		// recuperar elemento en a posici�n 0
//		lista.get(0);

		ArrayList<String> listaString = new ArrayList<>();

		listaString.add("Un string");

//		
	}

}
