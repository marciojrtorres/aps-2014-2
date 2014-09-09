package modelo;

// Objeto de Valor (Value Object)
// Eh o valor que ele armazena que o qualifica
// Microtipo (classe com poucos atributos e funcionalidades)
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

    // metodos que retornam uma nova instancia
    public Peso addGramas(int gramas) {
        return Peso.emGramas(this.gramas + gramas);
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

    @Override
    public int hashCode() {
        return gramas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if ( ! (o instanceof Peso)) return false;
        Peso outroPeso = (Peso) o;
        return this.gramas == outroPeso.gramas;
    }

}