package app.curso.banco.entidad;

import java.util.HashMap;

public class Cliente extends Persona {

	private float totalDinero;
	// cada cuenta tiene una clave o ID de tipo String
	// y una cantidad de dinero Float
	private HashMap<String, Float> cuentas;

	public Cliente() {

	}

	public Cliente(int id, String nombre, String telefono) {
		super(id, nombre, telefono);
		this.totalDinero = 0;
		this.cuentas = new HashMap<>();
	}

	public Cliente(int id, String nombre, String telefono, float totalDinero) {
		super(id, nombre, telefono);
		this.totalDinero = totalDinero;
		this.cuentas = new HashMap<>();
	}

	public float getTotalDinero() {
		return this.totalDinero;
	}

	public void setTotalDinero(float totalDinero) {
		this.totalDinero = totalDinero;
	}

	public HashMap<String, Float> getCuentas() {
		return cuentas;
	}

	public void setCuentas(HashMap<String, Float> cuentas) {
		this.cuentas = cuentas;
	}

	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Cuentas:");
		mostrarCuentas();
		System.out.println("Total dinero: " + this.totalDinero + " €\n");
	}

	public float ingresarDinero(float dinero) {
		this.totalDinero += dinero;
		return this.totalDinero;
	}

	public float retirarDinero(float dinero) {
		this.totalDinero -= dinero;
		return this.totalDinero;
	}

	public void abrirCuenta(String idCuenta, Float dinero) {
		this.cuentas.put(idCuenta, dinero);
		ingresarDinero(dinero);
		System.out.println("Se ha abierto la cuenta " + idCuenta);
	}

	public float ingresarDinero(String idCuenta, Float dinero) {

		Float dineroEnCuenta = this.cuentas.get(idCuenta);
		// comprobar si existe la cuenta
		// (si no existe, en vez de dinero tenemos null)
		if (dineroEnCuenta != null) {
			this.cuentas.put(idCuenta, dineroEnCuenta + dinero);
			ingresarDinero(dinero);
			System.out.println("Se ha ingresado " + dinero + " € en " + idCuenta);
		} else {
			System.out.println("La cuenta no existe");
		}
		return this.totalDinero;
	}

	public float retirarDinero(String idCuenta, Float dinero) {
		Float dineroEnCuenta = this.cuentas.get(idCuenta);
		if (dineroEnCuenta != null) {
			this.cuentas.put(idCuenta, dineroEnCuenta - dinero);
			retirarDinero(dinero);
			System.out.println("Se ha retirado " + dinero + " € de " + idCuenta);
		} else {
			System.out.println("La cuenta no existe");
		}
		return this.totalDinero;
	}

	public void cerrarCuenta(String idCuenta) {
		Float dineroEnCuenta = this.cuentas.get(idCuenta);
		retirarDinero(idCuenta, dineroEnCuenta);
		this.cuentas.remove(idCuenta);
		System.out.println("Se ha cerrado la cuenta " + idCuenta);
	}

	public void mostrarCuentas() {
		this.cuentas.forEach((idCuenta, dinero) -> {
			System.out.println("> " + idCuenta + ": " + dinero + " €");
		});
	}

}
