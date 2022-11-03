package app.curso.banco.main;

import java.util.HashMap;
import java.util.Scanner;

import app.curso.banco.entidad.Cliente;
import app.curso.banco.entidad.Gestor;
import app.curso.banco.util.Utiles;

public class ConsolaBanco {

	public static void main(String[] args) {

		HashMap<Integer, Cliente> clientes = new HashMap<>();
		HashMap<Integer, Gestor> gestores = new HashMap<>();

		// para leer del teclado
		Scanner keyboard = new Scanner(System.in);

		int menuSeleccionado = -1;

		// cliente de prueba para 18. y 19.
		// NO AÑADIR A LA PRÁCTICA
		Cliente c1 = new Cliente(222, Utiles.nombreAleatorio(), "777 777 777");
		clientes.put(c1.getId(), c1);

		do {
			System.out.println("1. Crear Gestor");
			System.out.println("2. Crear Cliente");
			System.out.println("18. Login");
			System.out.println("19. Registro");
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
			case 18:
				System.out.println("Login clientes");

				System.out.print("Id del cliente: ");
				int idCliente = keyboard.nextInt();
				Cliente clienteParaLogin = clientes.get(idCliente);

				System.out.print("Contraseña: ");
				String pass = keyboard.next();
				
				// obtener contraseña del cliente
				String passCliente = clienteParaLogin.getPassword();

				// comprobar si es distinta de null
				boolean tienePass = passCliente != null;

				// usamos equals para comparar
				// los objetos (como String) no se comparan con ==
				boolean loginCorrecto = tienePass && passCliente.equals(pass);

				if (loginCorrecto) {
					System.out.println("Correcto!");
				} else {
					System.out.println("Incorrecto!");
				}

				break;
			case 19:
				// nos imaginamos que seleccionar un cliente y ponerle contraseña es "registrarlo"
				System.out.print("Id del cliente a registrar: ");
				int idARegistrar = keyboard.nextInt();
				Cliente clienteParaRegistro = clientes.get(idARegistrar);
				System.out.print("Nueva contraseña: ");
				String nuevaPass = keyboard.next();
				clienteParaRegistro.setPassword(nuevaPass);
				// actualizar cliente en la lista
				clientes.put(clienteParaRegistro.getId(), clienteParaRegistro);

				break;
			default:
				System.out.println("Opción desconocida...");
				break;
			}

		} while (menuSeleccionado != 0);
	}

}
