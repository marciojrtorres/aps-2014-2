package agenda;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {

	private List<Contato> contatos = new ArrayList<>();
	private int tipoArmazenamento = 0; // 0 CSV, 1 POSICIONAL, 2 BINÁRIO
	
	public Agenda(int tipoArmazenamento) {
		this.tipoArmazenamento = tipoArmazenamento;
	}

	public void carrega() {
		if (tipoArmazenamento == 0) {
			// armazena em CSV
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
		} else if (tipoArmazenamento == 1) {
			// armazena em TXT com colunas fixas 
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
		} else if (tipoArmazenamento == 2) {
			// armazena em binário
			try {
				String nomeArquivo = System.getProperty("user.home")
						+ "/agenda.bin";
				
				File file = new File(nomeArquivo);

				if (!file.exists())
					return;
				
				ObjectInputStream in = new ObjectInputStream(
						new FileInputStream(file));
				
				contatos = (List<Contato>) in.readObject();
				
				in.close();
			
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	}

	public void armazena() {
		if (tipoArmazenamento == 0) {
			// lê em CSV
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
		} else if (tipoArmazenamento == 1) {
			// lê em TXT com colunas fixas
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
		} else if (tipoArmazenamento == 2) {
			// lê em binário
			try {
				String nomeArquivo = System.getProperty("user.home")
						+ "/agenda.bin";
				
				ObjectOutputStream out = new ObjectOutputStream(
						new FileOutputStream(
								new File(nomeArquivo)));
				
				out.writeObject(contatos);
				
				out.close();
			
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	}

	private String spaces(int spaces) {
		String s = "";
		for (int i = 0; i < spaces; i++) s += ' ';
		return s;
	}

	public void add(Contato contato) {
		this.contatos.add(contato);
	}
	
	public List<Contato> getContatos() {
		return contatos;
	}

}
