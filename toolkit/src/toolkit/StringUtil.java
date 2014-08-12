package toolkit;

/**
 * Disponibiliza métodos para lidar com textos,
 * strings e caracteres.
 *
 * @author Marcio Torres
 * @version 1.0
 */
public class StringUtil {
    // constante substitui um numero magico
    private static final int DIF_MIN_MAIUS = 32;

    private StringUtil() {}

    // pré-condição: entrada esperada?
    // String caracteres minusculos
    // pós-condição: saída esperada?
    // String caracteres maiusculos

    // entradas alternativas:
    // tudo maisculo, numeros simbolos misturado
    // nulo

    // dividir o problema:
    // upper é um upper de cada char
    // simplificar expressoes:
    // reaproveitar condicionais, tornar legivel
    //

    // DRY: Don't Repeat Yourself
    // NSR: Não Se Repita

    // javadoc

    /**
     * Converte uma String de caracteres minusculos
     * para caracteres maiusculos.
     * Ex.: <b>aula2Teste -> AULA2TESTE</b>
     *
     * @param str     A string a ser convertida
     * @return        A string com letras maiusculas
     * @throws NullPointerException  Se a string for null
     */
    public static String upper(String str) {

        if (str == null) {
            throw new NullPointerException("nao pode ser nulo");
        }

        char[] chars = str.toCharArray();
        // cada caractere
        for (int i = 0; i < chars.length; i++) {
            chars[i] = upper(chars[i]); // extrair um método
        }
        return new String(chars);
    }

    public static char upper(char ch) {
        // refatorado: substituir condicional por consulta a metodo
        // if ((chars[i] >= 97 && chars[i] <= 122) || chars[i] == 231) {
        if (ehMinusculo(ch)) {
            // return (char) (ch - 32); // número mágico (constante mágica)
            return (char) (ch - DIF_MIN_MAIUS); // número mágico (constante mágica)
        }
        return ch;
    }

    private static boolean ehMinusculo(char ch) {
        return (chars[i] >= 97 && chars[i] <= 122) || chars[i] == 231;
    }

}