package app.curso.banco.main;

import java.util.HashMap;

import app.curso.banco.entidad.Cliente;

public class TestCuentas {

	public static void main(String[] args) {

		Cliente cliente = new Cliente(1, "Ana Martínez", "664552110");

		cliente.abrirCuenta("ES123", 100f);

		cliente.abrirCuenta("ES678", 30f);

		cliente.mostrarInfo();

		cliente.retirarDinero("ES123", 20f);

		cliente.mostrarInfo();

		cliente.ingresarDinero("ES678", 200f);
		
		cliente.mostrarInfo();
		
		cliente.cerrarCuenta("ES123");
		
		cliente.mostrarInfo();
	}

}
