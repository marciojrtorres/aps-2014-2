package diskview;

public class Main {
	public static void main(String[] args) {
		
		// altere para c:/ ou / para testar outras unidades
		DiskView monitor = new DiskView("/home/prof"); 
		
		// rodando a thread (subprocesso)
		monitor.start();

	}
}