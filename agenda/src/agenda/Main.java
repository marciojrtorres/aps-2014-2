package agenda;


public class Main {

	public static void main(String[] args) {
		
		Agenda agenda = new Agenda();
		
		agenda.setPersistencia(new PersistenciaTXT());
		
		agenda.carrega();
		
		for (Contato c : agenda.getContatos()) System.out.println(c);
		
		agenda.add(new Contato("Daniel Bilhalva", "99887766", "bilha@lva.com"));
		
		agenda.setPersistencia(new PersistenciaCSV());		
		
		agenda.armazena();
		
	}

}
