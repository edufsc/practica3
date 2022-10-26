package app.curso.banco.main;

import app.curso.banco.entidad.Cliente;

public class Main {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente(1,"Paco","(+34) 777 666 222");
		
		c1.mostrarInfo();
	}

}
