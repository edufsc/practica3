package app.curso.banco.entidad;

public class Transferencia extends Mensaje {

	private float dinero;

	public Transferencia() {

	}

	public Transferencia(
			int id,
			char tipoEmisor,
			int idEmisor,
			char tipoReceptor,
			int idReceptor,
			String textoMensaje,
			float dinero
			) {
		super(id, tipoEmisor, idEmisor, tipoReceptor, idReceptor, textoMensaje);
		this.dinero = dinero;
	}

	public float getDinero() {
		return dinero;
	}

	public void setDinero(float dinero) {
		this.dinero = dinero;
	}

	public String toString() {
		// obtenemos toString de Mensaje (padre)
		String texto = super.toString();
		// añadimos el dinero al final
		texto += " Dinero: " + this.dinero + " €";
		// texto = texto + " Dinero: " + this.dinero + " €";
		return texto;
	}

}
