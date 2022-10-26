package app.curso.banco.entidad;

public class Gestor extends Persona {

	private int idOficina;

	public Gestor() {
	}

	public Gestor(int id, String nombre, String telefono, int idOficina) {
		super(id, nombre, telefono);
		this.idOficina = idOficina;
	}

	public int getIdOficina() {
		return idOficina;
	}

	public void setIdOficina(int idOficina) {
		this.idOficina = idOficina;
	}

	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Id oficina: " + this.idOficina + "\n");
	}

}
