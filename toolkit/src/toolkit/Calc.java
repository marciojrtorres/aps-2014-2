package toolkit;

// Fail-Fast: falhe rápido (fazer quebrar)
// Fail-Safe: seguro contra falhas

public class Calc {

    // construtor privado
    // Princípio do Menor Privilégio
    // Tudo é proibido até ser permitido
    private Calc() {

    }

    // estatico = pertence a classe
    public static int sum(int a, int b) {
        int r = a + b;
        if (a > 0 && b > 0 && r < 0)
            throw new RuntimeException("Aconteceu overflow, resultado negativo de uma soma positiva");

        return r;
    }

    public static int mult(int a, int b) {
            int r = 0;
            for (int i = 0; i < a; i++) {
                r = r + b;
            }
            return r;
    }

    public static int pow(int base, int exp) {
        int r = base;
        for (int i = 0; i < exp - 1; i ++) {
            r = mult(r, base);
        }
        return r;
    }

    public static int sqr(int base) {
        return pow(base, 2);
    }
}