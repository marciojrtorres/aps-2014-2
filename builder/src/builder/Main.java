package builder;

public class Main {

	public static void main(String[] args) {		
		
		InfNutricional inf = new InfNutricional(20,98,32,0,0,0,0,0,404,193,0.75);
		
		Produto prod = new Produto("Doce de Abóbora", 300, inf);
		
		System.out.println(prod);
	}

}

/*
Doce de Abóborda
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