package agenda;

import java.io.File;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class PersistenciaCSV implements IPersistencia {
	
	@Override
	public void carrega(List<Contato> contatos) {
		// carrega em CSV
		try {
			String nomeArquivo = System.getProperty("user.home")
					+ "/agenda.csv";

			File file = new File(nomeArquivo);

			if (!file.exists())
				return;

			Scanner scan = new Scanner(file);
			while (scan.hasNextLine()) {
				String linha = scan.nextLine();
				String[] campos = linha.split(";");
				Contato contato = new Contato();
				contato.setNome(campos[0]);
				contato.setTelefone(campos[1]);
				contato.setEmail(campos[2]);
				contatos.add(contato);
			}
			scan.close();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void armazena(List<Contato> contatos) {
		// armazena em CSV
		try {
			String nomeArquivo = System.getProperty("user.home")
					+ "/agenda.csv";

			PrintWriter arquivo = new PrintWriter(new File(nomeArquivo));
			for (Contato contato : contatos) {
				arquivo.print(contato.getNome() + ";");
				arquivo.print(contato.getTelefone() + ";");
				arquivo.println(contato.getEmail());
			}
			arquivo.flush();
			arquivo.close();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
