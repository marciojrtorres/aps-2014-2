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

        comoLidaremosComStrings();
    }

    private static void comoLidaremosComStrings() {
        // Experiencias com String
        // Nao pode utilizar metodos de string ou operador +
        // So lidaremos com o array de char, criando uma nova String quando necessario
        String s = "teste";

        // ['t', 'e', 's', 't', 'e']
        //   0,   1,   2,   3,   4
        char[] letras = s.toCharArray();

        // char eh com aspas simples
        letras[0] = 'T'; // ['T', 'e', 's', 't', 'e']

        s = new String(letras); // "Teste"

        System.out.println(s); // Teste

        System.out.println();

        // percorrer o array de char
        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }

        // ver o char como inteiro
        for (int i = 0; i < letras.length; i++) {
            System.out.println((int)letras[i]);
        }

        // char eh um int, int eh um char
        int c1 = (int) 'P';  // 80
        char c2 = (char) 80; // 'P'
    }
}