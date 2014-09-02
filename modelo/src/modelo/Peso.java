package modelo;

public class Peso {
    // geralmente, se escolhe a menor medida possivel, ex: grama
    // considerar sempre int em vez de float/double
    private int gramas;

    public Peso(int gramas) {
        this.gramas = gramas;
    }

    public int getPeso() {
        return gramas;
    }

    public void setPeso(int gramas) {
        this.gramas = gramas;
    }

}