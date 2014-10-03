package builder;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {		
		
		InfNutricional inf = new InfNutricional(20,98,32,0,0,0,0,0,404,193,0.75);
		
		Produto prod = new Produto("Doce de Abóbora", 300, inf);
		
		// Persistência: DAO, AR (Active Record - "Registro Ativo")
		
		ProdutoDAO dao = new ProdutoDAO();
		
		dao.insert(prod);
		
		System.out.println(prod);
		
		//new InfNutricional(20,98,32,0,0,0,0,0,508,158,0.95);
		InfNutricional inf2 = new InfNutricionalBuilder()
				.carboidrato(32)
				.porcao(20)
				.valorEnergetico(98)
				.build();
		
		// builder: desacopla a ordem dos parametros
		// nomes aos parâmetros
		
		Produto prod2 = new Produto("Doce de Uva", 300, inf2);
		
		System.out.println(prod2);
		
		// Padrão de Criação: padrão de projeto para criação de objetos
		// BUILDER 
		
		
	}

}

/*
Doce de Abóbora
----------------
Porção 20g
Valor energético 98kcal
Carboidrato 32g
Colesterol 0g
Proteina 0g
Gordura total 0g
Gordura saturada 0g
Gordura trans 0g
Sódio 404mg
Cálcio  193mg
Ferro 0.75mg


Doce de Uva
----------------
Porção 20g
Valor energético 98kcal
Carboidrato 32g
Colesterol 0g
Proteina 0g
Gordura total 0g
Gordura saturada 0g
Gordura trans 0g

Sódio 508mg
Cálcio  158mg
Ferro 0.95mg

*/