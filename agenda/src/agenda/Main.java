package agenda;

public class Main {

	public static void main(String[] args) {
		
		Agenda agenda = new Agenda(0);
		
		agenda.carrega();
		
		for (Contato c : agenda.getContatos()) System.out.println(c);
		
		agenda.add(new Contato("Rafael Souza", "88442211", "rafael.souza@provedor.com"));
		
		agenda.armazena();
		
		
	}

}
