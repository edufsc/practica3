package app.curso.banco.main;

import java.util.HashMap;
import java.util.Scanner;

import app.curso.banco.entidad.Cliente;
import app.curso.banco.entidad.Gestor;

public class ConsolaBanco {

	public static void main(String[] args) {

		HashMap<Integer, Cliente> clientes = new HashMap<>();
		HashMap<Integer, Gestor> gestores = new HashMap<>();

		// para leer del teclado
		Scanner keyboard = new Scanner(System.in);

		int menuSeleccionado = -1;

		do {
			System.out.println("1. Crear Gestor");
			System.out.println("2. Crear Cliente");
			System.out.println("0. Salir\n");
			System.out.print("Opción: ");
			menuSeleccionado = keyboard.nextInt();

			switch (menuSeleccionado) {
			// salir
			case 0:
				System.out.println("Saliendo...");
				break;
			case 1:
				System.out.println("Crear gestor");
				break;
			case 2:
				System.out.println("Crear cliente");
				break;
			default:
				System.out.println("Opción desconocida...");
				break;
			}

		} while (menuSeleccionado != 0);
	}

}
