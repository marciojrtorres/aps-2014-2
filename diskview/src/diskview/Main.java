package diskview;

public class Main {
	public static void main(String[] args) {
		
		// altere para c:/ ou / para testar outras unidades
		DiskView monitor = new DiskView("/home/prof"); 
		
		DiskViewWindow window = new DiskViewWindow();
		DiskViewLog log = new DiskViewLog();
		
		monitor.adicionaObservador(window);
		monitor.adicionaObservador(log);
		monitor.adicionaObservador(new DiskViewOSD());
		// rodando a thread (subprocesso)
		monitor.start();

	}
}