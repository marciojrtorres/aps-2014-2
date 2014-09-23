package estrategia;

import javax.swing.JFrame;
import javax.swing.JTextArea;

// Estratégia Concreta 

public class ImprimeJanela implements Imprime {
	
	public void imprime(Documento doc) {
		// Gráfico/Janela
		JFrame janela = new JFrame(doc.getTitulo());
		janela.add(new JTextArea(doc.getTexto()));
		janela.setSize(400, 300);
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setVisible(true);
	}

}
