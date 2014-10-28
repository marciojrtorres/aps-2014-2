package diskview;

public interface IDiskViewObserver {

	void atualiza(long espacoUsado, long espacoTotal, String unidade);

}
