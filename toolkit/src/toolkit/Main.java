package toolkit;

public class Main {
    public static void main(String[] args) {

        // Casos de Teste:
        System.out.println(Calc.sum(1, 2));  // 3
        System.out.println(Calc.sum(2, 5));  // 7
        System.out.println(Calc.sum(2, -5)); // -3
        System.out.println(Calc.sum(1_000_000, 1_000_000)); // 2_000_000

        // Assertiva (Afirmando (Verdadeiro (true)))
        System.out.println(Calc.sum(1, 2) == 3);
        System.out.println(Calc.sum(2, 5) == 7);
        System.out.println(Calc.sum(2, -5) == -3);

        // Definindo a API:
        // System.out.println(Calc.mult(2, 5)  == 10);
        // System.out.println(Calc.mult(4, 6)  == 24);
        // System.out.println(Calc.mult(3, -9) == -27);

        // System.out.println(
        //     Calc.sum(2_000_000_000,
        //              2_000_000_000)); // 4_000_000_000

        String s = "teste";

        char[] letras = s.toCharArray();
        // ['t', 'e', 's', 't', 'e']

        letras[0] = 'T'; // char eh com aspas simples
        // ['T', 'e', 's', 't', 'e']

        s = new String(letras);

        System.out.println(s); // Teste

        System.out.println();
        // percorrer o array de char
        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }

        for (int i = 0; i < letras.length; i++) {
            System.out.println((int)letras[i]);
        }

        // API para lidar com Strings
        // upperCase, upper, up, upCase, ...
        System.out.println(StringUtil.uppercase("teste")); // "TESTE"

        // simetria, consistencia
        System.out.println(StringUtil.downcase("TESTE")); // "teste"


    }
}