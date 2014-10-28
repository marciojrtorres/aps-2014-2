package estrategia;

public class ImprimeTerminal implements Imprime {

	public void imprime(Documento doc) {

		// Console/Terminal
		System.out.println("Título: ");
		System.out.println(doc.getTitulo());
		System.out.println("Texto:");
		System.out.println(doc.getTexto());
	}
	
}
