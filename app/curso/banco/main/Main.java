package app.curso.banco.main;

import app.curso.banco.entidad.*;

public class Main {

	public static void main(String[] args) {

		Cliente c1 = new Cliente(1, "Paco", "(+34) 777 666 222", 120f);

//		c1.mostrarInfo();

		System.out.println("Hemos ingresado 100.34 € y ahora tenemos " + c1.ingresarDinero(100.34f) + " €");

//		c1.mostrarInfo();

		c1.retirarDinero(320);

//		c1.mostrarInfo();

		// crear Gestor con idOficina

		Gestor g1 = new Gestor(24, "Ana", "(+34) 777 444 333", 3);

//		g1.mostrarInfo();

		Mensaje m1 = new Mensaje();
		Mensaje m2 = new Mensaje(1, Mensaje.TIPO_CLIENTE, c1.getId(), Mensaje.TIPO_GESTOR, g1.getId(),
				"Mensaje de prueba");

		System.out.println("Mensaje como texto: " + m2.toString());
		// si no indicamos método, Java utiliza toString
		// para devolver un objeto como texto
		System.out.println("Mensaje como texto: " + m2);

	}

}
