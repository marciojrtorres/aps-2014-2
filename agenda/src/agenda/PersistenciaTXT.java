package agenda;

import java.io.File;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class PersistenciaTXT implements IPersistencia {
	
	@Override // sobrescreve/implementa
	public void carrega(List<Contato> contatos) {
		// carrega em TXT com colunas fixas 
		try {
			String nomeArquivo = System.getProperty("user.home")
					+ "/agenda.txt";

			File file = new File(nomeArquivo);

			if (!file.exists())
				return;

			Scanner scan = new Scanner(file);
			while (scan.hasNextLine()) {
				String linha = scan.nextLine();
				Contato contato = new Contato();
				contato.setNome(linha.substring(0, 20).trim());
				contato.setTelefone(linha.substring(20, 30).trim());
				contato.setEmail(linha.substring(30).trim());
				contatos.add(contato);
			}
			scan.close();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void armazena(List<Contato> contatos) {
		// armazena em TXT com colunas fixas
		try {
			String nomeArquivo = System.getProperty("user.home")
					+ "/agenda.txt";

			PrintWriter arquivo = new PrintWriter(new File(nomeArquivo));
			for (Contato contato : contatos) {
				arquivo.print(contato.getNome() + spaces(20 - contato.getNome().length()));
				arquivo.print(contato.getTelefone() + spaces(10 - contato.getTelefone().length()));
				arquivo.println(contato.getEmail());
			}
			arquivo.flush();
			arquivo.close();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	private String spaces(int spaces) {
		String s = "";
		for (int i = 0; i < spaces; i++) s += ' ';
		return s;
	}
}
