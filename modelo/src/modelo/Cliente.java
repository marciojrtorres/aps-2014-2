package modelo;

public class Cliente {

    private String nome;
    private String cpf;

    private Telefone[] telefones = new Telefone[2];

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setTelefonePrincipal(Telefone tel) {
        this.telefones[0] = tel;
    }

    public void setTelefoneContato(Telefone tel) {
        this.telefones[1] = tel;
    }

    public Telefone getTelefonePrincipal() {
        return this.telefones[0];
    }

    public Telefone getTelefoneContato() {
        return this.telefones[1];
    }

}