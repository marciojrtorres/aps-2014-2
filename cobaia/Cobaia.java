
public class Cobaia {

	public static void main(String[] args) {

		System.out.println("Cobaia sobreviveu à experiência");

		double soma = 0;

		for (int i = 0; i < 10; i++) {
			soma = soma + 0.1;
		}

		System.out.println("soma == 1: " + (soma == 1));

		System.out.println();

		System.out.println(soma);

		// Princípio da Menor Surpresa


		long start = System.currentTimeMillis();
		String s = null;
		for (int i = 0; i < 1000000; i++) {
			// s = i + "";
			s = String.valueOf(i);
		}
		System.out.println((System.currentTimeMillis() - start) + " ms");
	}
}