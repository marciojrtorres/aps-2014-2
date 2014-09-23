package estrategia;


public class Main {

	public static void main(String[] args) {
		
		// Programação por Intenção
		// Três atalhos essenciais:
		// CTRL + ESPACO, CTRL + 1, CTRL + 3
		
		Documento doc = new Documento();
		
		// TODO achar um exemplo melhor
		
		doc.setTitulo("TADS/IFRS");
		
		doc.setTexto("Texto do Curso");
		
		// definir se é Console, Janela, Arquivo, para depois imprimir:			
		
		doc.setImprime(new ImprimeArquivo());
		doc.imprime();
		
		doc.setImprime(new ImprimeConsole());
		doc.imprime();
			
		doc.setImprime(new Imprime() {
			@Override
			public void imprime(Documento doc) {
				System.out.println("<documento>");
				System.out.println("  <titulo>" + doc.getTitulo() + "</titulo>");
				System.out.println("  <texto>" + doc.getTexto() + "</texto>");		
				System.out.println("</documento>");
			}
		});
		
		doc.imprime(); // XML
		
		// XML:
		// <documento>
		// 	<titulo>TADS/IFRS</titulo>
		//  <texto>Texto do Curso</texto>
		// </documento>
		
		// Como adicionar novo formato sem alterar a classe Documento?
		
		// Princípio:
		
		// As classes devem estar fechadas para modificações
		// Mas devem estar abertas para extensões
		
		// Preferir composição em vez de herança
		
		// Padrão de Projeto: ESTRATÉGIA
		// Cada algoritmo é uma Estratégia, ex.:
		// Estratégia Console, Estratégia Janela, Estratégia Arquivo,
		// Estratégia XML
		// Estratégia de quê? Imprimir!
		// O que a estratégia encapsula? instruções de impressão
		// O Algoritmo!
		// A estratégia pode ser alterada em tempo de execução.
		
		// Estratégia (Design Pattern) é concordante com os princípios:
		
		// As classes devem estar fechadas para modificações, mas
		// devem estar abertas para extensões (OPEN/CLOSE PRINCIPLE,
		// (Princípio Aberto/Fechado)
		
		// Preferir composição em vez de herança
		

	}
}
