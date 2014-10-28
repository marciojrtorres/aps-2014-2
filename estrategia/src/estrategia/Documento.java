package estrategia;

public class Documento {
	
	private String titulo;
	private String texto;
	private Imprime impressor;

	public String getTitulo() {
		return titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setTexto(String texto) {
		this.texto = texto;	
	}

	public Imprime getImpressor() {
		return impressor;
	}

	public void setImpressor(Imprime impressor) {
		this.impressor = impressor;
	}

	public void imprime() {
		impressor.imprime(this);
	}

}
