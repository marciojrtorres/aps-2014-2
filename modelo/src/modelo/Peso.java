package modelo;

public class Peso {
    // geralmente, se escolhe a menor medida possivel, ex: grama
    // considerar sempre int em vez de float/double
    private int gramas;

    private Peso(int gramas) {
        this.gramas = gramas;
    }

    // metodo fabrica estatico eh uma alternativa aos construtores
    // Peso.emGramas(1500); eh melhor new Peso(1500)
    // vantagem do metodo eh que ele tem nome
    public static Peso emGramas(int gramas) {
        return new Peso(gramas);
    }

    public static Peso emKilos(double kilos) {
        return Peso.emGramas( (int) (kilos * 1000) );
    }

    public static Peso emLibras(double libras) {
        return Peso.emGramas( (int) (libras * 453.59) );
    }

    public int getGramas() {
        return gramas;
    }

    public double getKilos() {
        return gramas / 1000.0;
    }

    public double getLibras() {
        return gramas / 453.59;
    }

    @Override
    public String toString() {
        return gramas + "g";
    }

}