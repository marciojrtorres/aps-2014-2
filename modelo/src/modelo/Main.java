package modelo;

public class Main {
    public static void main(String[] args) {
        Agua a = new Agua(25);

        while (!a.isGasosa()) a.aquecer();

        System.out.println(a.getTemperatura());

        // essas instruções deve acontecer quando
        // trocar de estado, mas não podem ficar no main
        // obs.: só na troca
        // System.out.println("AGUA EVAPOROU");  // liq->gas
        // System.out.println("AGUA CONGELOU");  // liq->sol
        // System.out.println("AGUA LIQUEFEZ");  // sol->liq
        // System.out.println("AGUA CONDENSOU"); // gas->liq
    }
}