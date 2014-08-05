package toolkit;

// Fail-Fast: falhe rápido (fazer quebrar)
// Fail-Safe: seguro contra falhas

public class Calc {

    public static int sum(int a, int b) {
        int r = a + b;
        if (a > 0 && b > 0 && r < 0)
            throw new RuntimeException("Aconteceu overflow, resultado negativo de uma soma positiva");

        return r;
    }

}