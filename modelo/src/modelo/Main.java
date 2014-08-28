package modelo;

public class Main {

    public static void main(String[] args) throws Exception {

        Cliente c = new Cliente();

        System.out.println(c.getNome() == null);
        System.out.println(c.getCpf() == null);

        c.setNome("Nome de Teste #1");
        c.setCpf("11133355577");

        System.out.println(c.getNome().equals("Nome de Teste #1"));
        System.out.println(c.getCpf().equals("11133355577"));

        System.out.println(c.getTelefonePrincipal() == null);
        System.out.println(c.getTelefoneContato() == null);

        c.setTelefonePrincipal(new Telefone("53", "88779977"));
        c.setTelefoneContato(new Telefone("32549875"));

        System.out.println(c.getTelefonePrincipal().equals(new Telefone("53", "88779977")));
        System.out.println(c.getTelefoneContato().equals(new Telefone("32549875")));

        try {
            c.setCpf("1133355577");
            throw new Exception("falhou");
        } catch (IllegalArgumentException e) {
            System.out.println("exception ok");
        }

        System.out.println("Testes OK");
    }

}