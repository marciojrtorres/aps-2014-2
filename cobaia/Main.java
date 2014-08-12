public class Main {
    public static void main(String[] args) {

        // Classe/Tipo
        // Objeto/Instância

        // Objetos tem "estado", estao "algo"
        // Objetos tem "comportamento", fazem "algo"

        // estado: atributos/propriedades
        // comportamento: metodos/acoes

        // modelagem incluir níveis de abstração
        // abstração -> ignorar detalhes irrelevantes
        // para o modelo

        // Tipo/Classe -> Agua
        // Instancia -> a

        // API (CONTRATO)
        // MODELO

        Agua a = new Agua(25); // 25c

        System.out.println(a.temperatura() == 25); // 25

        a.esfriar(); // -1 grau
        a.esfriar(); // -1 grau

        System.out.println(a.temperatura() == 23); // 23

        a.esfriar();

        System.out.println(a.temperatura() == 22); // 22

        System.out.println(a.estaCongelada() == false); // false

        System.out.println(a.estaLiquida() == true); // true

    }
}