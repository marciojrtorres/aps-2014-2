package agenda;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class PersistenciaBIN implements IPersistencia {

	@Override
	public void carrega(List<Contato> contatos) {
		// carrega em binário
		try {
			String nomeArquivo = System.getProperty("user.home")
					+ "/agenda.bin";

			File file = new File(nomeArquivo);

			if (!file.exists())
				return;

			ObjectInputStream in = new ObjectInputStream(new FileInputStream(
					file));
			
			List<Contato> arquivo = (List<Contato>) in.readObject();
			
			contatos.clear();
			contatos.addAll(arquivo);

			in.close();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void armazena(List<Contato> contatos) {
		// armazena em binário
		try {
			String nomeArquivo = System.getProperty("user.home")
					+ "/agenda.bin";

			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream(new File(nomeArquivo)));

			out.writeObject(contatos);

			out.close();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
