package diskview;

public class DiskViewLog implements IDiskViewObserver {
	
	@Override
	public void atualiza(long espacoUsado, long espacoTotal, String unidade) {
		// registro do uso do disco
		System.out.println(new java.util.Date());
		System.out.println(espacoUsado + "KB usados de " + espacoTotal + "KB totais");
		// --- fim registro
	}

}
