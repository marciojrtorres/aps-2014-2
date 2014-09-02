package modelo;

public class Main {

    public static void main(String[] args) throws Exception {

        // Entidade -> Objeto com Identidade (campo chave)
        Patrimonio p1 = new Patrimonio(234, "Computador Intel Core i5");
        Patrimonio p2 = new Patrimonio(567, "Mesa para computador");
        Patrimonio p3 = new Patrimonio(890, "Mesa para computador");
        Patrimonio p4 = new Patrimonio(234, "Computador");

        System.out.println(p1.equals(p2)); // false
        System.out.println(p2.equals(p3)); // false
        System.out.println(p3.equals(p4)); // false
        System.out.println(p1.equals(p4)); // true

        // p1.setPeso(?); // usar um primitivo (scalar), ex.: int
        // p1.setPeso(5000); // quanto pesa?

        p1.setPeso(Peso.emGramas(1500)); // metodo fabrica estatico

        p1.setPeso(Peso.emKilos(5)); // 5kg

        p1.setPeso(Peso.emLibras(10)); // 10 * 454 = 4540 gramas

        System.out.println(p1.getPeso().getKilos());

        System.out.println(Peso.emKilos(500).getLibras());

    }

}