package agenda;

import java.util.ArrayList;
import java.util.List;

// PILARES FUNDAMENTAIS DA ORIENTACAO A OBJETOS
// ENCAPSULAMENTO, HERANCA, AGREGACAO, POLIMORFISMO
public class Agenda {

	private List<Contato> contatos = new ArrayList<>();
	private IPersistencia persistencia; // estrategia/interface	
	
	// settar estrategia
	public void setPersistencia(IPersistencia persistencia) {
		this.persistencia = persistencia;
	}
	
	
	
	// delega para a estrategia
	public void carrega() {
		persistencia.carrega(contatos);
	}

	// delega para a estragegia
	public void armazena() {
		persistencia.armazena(contatos);
	}

	

	public void add(Contato contato) {
		this.contatos.add(contato);
	}
	
	public List<Contato> getContatos() {
		return contatos;
	}



}
