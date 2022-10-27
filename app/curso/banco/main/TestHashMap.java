package app.curso.banco.main;

import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {

		// nuevo HashMap con claves Integer y valores String
		HashMap<Integer, String> mapa = new HashMap<>();

		// añadir el valor "PACO" en la clave 2
		mapa.put(2, "PACO");

		// obtener lo que hay en la clave 2
		String enPosicion2 = mapa.get(2);

		System.out.println("En la posición 2 está " + enPosicion2);

		// sobreescribir lo que hay en la clave 2 con "ANA"
		// (igual que añadir)
		mapa.put(2, "ANA");

		enPosicion2 = mapa.get(2);

		System.out.println("En la posición 2 está " + enPosicion2);

		// si la clave no tiene valor, devuelve null
		String noExiste = mapa.get(47);

		System.out.println("En la posición 47 está " + noExiste);

		// vaciar HashMap
		mapa.clear();

		enPosicion2 = mapa.get(2);

		System.out.println("En la posición 2 está " + enPosicion2);

		// iterar HashMap
		mapa.forEach((clave, valor) -> {
			System.out.println("En la posición " + clave + " está " + valor);
		});
		
		// eliminar elemento con clave 2
		mapa.remove(2);
	}

}
