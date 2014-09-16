public class Main {
    public static void main(String[] args) {

        ComputadorQueConta c = new ComputadorQueConta(new Computador());
        System.out.println(c.getEstado()); // desligado
        usa(c);
        System.out.println(c.getEstado()); // ?
        c.reseta();
        // quantas vezes o botao liga foi pressionado
        System.out.println(c.getVezesLigado()); // 3

    }

    private static void usa(Computador c) {
        c.liga();
        c.liga();
        c.liga();
    }
}

// Decorator
class ComputadorQueConta extends Computador {

    // trocando herança por composição
    private Computador decorado; // estendido/decorado
    private int cont;

    public ComputadorQueConta(Computador computador) {
        this.decorado = computador;
    }

    public void liga() {
        decorado.liga();
        cont++;
    }

    public void desliga() {
        decorado.desliga();
    }

    public void reseta() {
        decorado.reseta();
    }

    public String getEstado() {
        return decorado.getEstado();
    }

    public int getVezesLigado() {
        return cont;
    }

}