package estrategia;


public class Documento {
	
	private String titulo;
	private String texto; // ALT + SHIFT + R
	
	// Guardar a estratégia de impressão
	private Imprime imprime;
	// Estratégia é sempre abstrata!
	
	// Método para trocar a estratégia de impressão
	
	public void setImprime(Imprime imprime) {
		this.imprime = imprime;
	}
	
	//

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

	public void imprime() {
		// o que o documento precisa?
		// objeto com método imprime(Documento doc):void
		// abstração! não pode ser concreto, ex.: ImprimeConsole não.
		// Como é feita uma abstração em Java?
		// INTERFACE!
		imprime.imprime(this);
	}

}
