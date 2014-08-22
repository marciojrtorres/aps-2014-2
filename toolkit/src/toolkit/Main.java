package toolkit;

import static toolkit.Calc.mult;

import static toolkit.StringUtil.*; // importa os metodos e atributos estáticos

import toolkit.StringUtil.Posicao;

// Toolkit: utilitários = procedimentos
// procedimentos -> codificados de alguma forma
// ex.: funções, método

public class Main {
    public static void main(String[] args) {



        // pad
        //
        // 10 colunas, uma palavra, um separador
        // "----daniel"
        // "daniel----"
        // "--daniel--"

        System.out.println(eq(pad("daniel", 10, '-', Posicao.ESQUERDA), "----daniel"));
        System.out.println(eq(pad("daniel", 10, '-', Posicao.DIREITA), "daniel----"));

        System.out.println(eq(padleft("daniel", 10, '-'), "----daniel"));
        System.out.println(eq(padright("daniel", 10, '-'), "daniel----"));

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