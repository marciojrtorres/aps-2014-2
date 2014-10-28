package diskview;

import java.io.IOException;

public class DiskViewOSD implements IDiskViewObserver {

	@Override
	public void atualiza(long espacoUsado, long espacoTotal, String unidade) {
		try {
			
			Runtime.getRuntime().exec("notify-send \"Espaco usado " + espacoUsado + "kb\" -t 1");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
