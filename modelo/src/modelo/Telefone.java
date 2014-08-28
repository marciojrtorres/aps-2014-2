package modelo;

public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String telefone) {
        this.ddd = ddd;
        this.numero = numero;
    }

    public Telefone(String numero) {
        this.numero = numero;
    }

    public String getDdd() {
        return this.ddd;
    }

    public String getNumero() {
        return this.numero;
    }

    @Override
    public String toString() {
        return ddd + " " + numero;
    }

}