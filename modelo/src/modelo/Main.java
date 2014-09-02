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
        // p1.setPeso(5000);

        p1.setPeso(new Peso(2500)); // quanto pesa?

        System.out.println(p1.getPeso());

    }

}