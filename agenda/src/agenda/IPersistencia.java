package agenda;

import java.util.List;

public interface IPersistencia {

	public void carrega(List<Contato> contatos);
	
	public void armazena(List<Contato> contatos);
	
}
