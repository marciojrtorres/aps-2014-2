package diskview;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/*
 * * DiskView e um sujeito (Observavel)
 * * Contem a Logica
 * * O Sujeito disponibiliza metodos para
 * adicionar/remover um Observador
 * * O Sujeito deve notificar todos os
 * observadores de uma atualizacao
 */
public class DiskView extends Thread {

	// unidade de disco monitorada
	private final File unidade;
	
	private List<IDiskViewObserver> observadores =
			new ArrayList<IDiskViewObserver>();
	
	public void adicionaObservador(IDiskViewObserver observador) {
		observadores.add(observador);
	}
	
	public void removeObservador(IDiskViewObserver observador) {
		observadores.remove(observador);
	}
	
	// construtor com o caminho da unidade
	public DiskView(String c) {
		this.unidade = new File(c);
	}
	
	@Override
	public void run() {		
		super.run();
		try {
			long espacoTotal = unidade.getTotalSpace() / 1024;
						
			long espacoLivre = 0;
			while (true) {
				// monitorar de meio em meio segundo
				Thread.sleep(500);
				if (espacoLivre != unidade.getFreeSpace()) {
					// obtendo espaco livre e calculando o ocupado
					espacoLivre = unidade.getFreeSpace();
					long espacoUsado = (unidade.getTotalSpace() - espacoLivre) / 1024; // espaço usado em kb
					
					for (IDiskViewObserver observador : observadores) {
						observador.atualiza(espacoUsado, espacoTotal, unidade.toString());
					}					
					// web.atualiza(espacoUsado, espacoTotal, unidade.toString()); // atualizando)
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
