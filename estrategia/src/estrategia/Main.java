package estrategia;


public class Main {

	public static void main(String[] args) {
		
		Documento doc = new Documento();
		
		doc.setTitulo("TADS/IFRS");
		
		doc.setTexto("O Tecnólogo em Análise e Desenvolvimento de Sistemas deverá ser capaz de analisar, projetar, documentar, especificar, testar, implantar e manter sistemas computacionais de informação. Será um profissional habituado a usar o raciocínio lógico, a empregar linguagens de programação e metodologias de construção de projetos. Cuidará da qualidade, usabilidade, robustez, integridade e segurança de programas computacionais.");
		
		doc.setImpressor(new ImprimeTerminal());
		doc.imprime();
		
		doc.setImpressor(new ImprimeJanela());
		doc.imprime();
		/*
		doc.setTipo(2);
		doc.imprime();
		*/
	}
}