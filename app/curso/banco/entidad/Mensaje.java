package app.curso.banco.entidad;

public class Mensaje {

	protected int id;

	protected char tipoEmisor;
	protected int idEmisor;

	protected char tipoReceptor;
	protected int idReceptor;

	protected String textoMensaje;

	// así no necesitamos acordárnos de los códigos
	// son accesibles públicamente y de forma estática
	public static final char TIPO_CLIENTE = 'c';
	public static final char TIPO_GESTOR = 'g';

	public Mensaje() {
		
	}

	public Mensaje(int id, char tipoEmisor, int idEmisor, char tipoReceptor, int idReceptor, String textoMensaje) {
		this.id = id;
		this.tipoEmisor = tipoEmisor;
		this.idEmisor = idEmisor;
		this.tipoReceptor = tipoReceptor;
		this.idReceptor = idReceptor;
		this.textoMensaje = textoMensaje;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdEmisor() {
		return idEmisor;
	}

	public void setIdEmisor(int idEmisor) {
		this.idEmisor = idEmisor;
	}

	public int getIdReceptor() {
		return idReceptor;
	}

	public void setIdReceptor(int idReceptor) {
		this.idReceptor = idReceptor;
	}

	public String getTextoMensaje() {
		return textoMensaje;
	}

	public void setTextoMensaje(String textoMensaje) {
		this.textoMensaje = textoMensaje;
	}

	public char getTipoEmisor() {
		return tipoEmisor;
	}

	public void setTipoEmisor(char tipoEmisor) {
		this.tipoEmisor = tipoEmisor;
	}

	public char getTipoReceptor() {
		return tipoReceptor;
	}

	public void setTipoReceptor(char tipoReceptor) {
		this.tipoReceptor = tipoReceptor;
	}

	// todos los objetos tienen el método toString para convertirlos a texto
	// podemos (y deberíamos) sobreescribirlo en nuestras clases
	public String toString() {
		String texto = "De: " + this.idEmisor + ", Para: " + this.idReceptor + " Mensaje: " + this.textoMensaje;
		return texto;
	}

}
