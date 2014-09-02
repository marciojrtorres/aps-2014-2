package modelo;

public class Patrimonio {

    private int numero;
    private String descricao;

    // usar um tipo complexo em vez de um tipo primitivo
    // ex.: Peso em vez de int ou double
    private Peso peso; // qualificar atributo, usando uma classe - tipo - microtipo

    public Patrimonio(int numero, String descricao) {
        this.numero = numero;
        this.descricao = descricao;
    }

    public Peso getPeso() { return peso; }
    public void setPeso(Peso peso) {
        this.peso = peso;
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() { // objetos equals devem ter o mesmo hash
        return this.numero; // mesmo campo usado no equals usa no hash
    }

    @Override
    public boolean equals(Object outro) {
        if (this == outro) return true; // eh a mesma ref entao true
        if (outro == null) return false; // se o outro eh null entao false
        if ( ! (outro instanceof Patrimonio)) return false; // nao eh do mesmo tipo entao false
        Patrimonio outroPatrimonio = (Patrimonio) outro; // cast
        return this.numero == outroPatrimonio.numero; // true/false
    }
}