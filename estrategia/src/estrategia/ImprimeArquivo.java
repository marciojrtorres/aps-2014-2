package estrategia;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ImprimeArquivo implements Imprime {
	
	public void imprime(Documento doc) {

		// IO/Arquivo
		String nomeArquivo = System.getProperty("user.home") + "/documento.txt";

		try (PrintWriter arquivo = new PrintWriter(nomeArquivo)) {

			arquivo.println("Título: ");
			arquivo.println(doc.getTitulo());
			arquivo.println("Texto:");
			arquivo.println(doc.getTexto());
			arquivo.flush();

		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

}
