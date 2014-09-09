package modelo;

public class Main {

    // Tipos Mutáveis
    // mudam com o tempo, alteram o estado durante a execucao

    public static void main(String[] args) throws Exception {

        Patrimonio p1 = new Patrimonio(1, "aaa");
        Patrimonio p2 = new Patrimonio(2, "bbb");

        Peso peso = Peso.emGramas(300);

        p1.setPeso(peso);
        p2.setPeso(peso);

        System.out.println(p1.getPeso());
        System.out.println(p2.getPeso());

        p1.setPeso(p1.getPeso().addGramas(100));
        // p1.setPeso(Peso.emGramas(500));

        System.out.println(p1.getPeso()); //
        System.out.println(p2.getPeso()); //


    }

}