package modelo;
// Princípios a seguir:

// Segregação de Comando/Consulta CQS (Command Query Segregation)
// Comando: altera o estado do objeto
// Consulta: consulta o estado do objeto
// Principio é de que Comandos não tem retorno
// e Consultas não alteram o estado

// Convenções/Estilos de Código:
// Padrão JavaBeans
// Propriedade: get (e is quando for boleano)

public class Agua {

    // atributo/campo privado
    private int temp;
    private MonitoraAgua mon = new MonitoraAgua();

    public Agua(int temp) {
        this.temp = temp;
    }

    public void esfriar() { // comando: altera o estado
        temp = temp - 1; // temp -= 1; temp--;
    }

    public void aquecer() { // comando: altera o estado
        temp = temp + 1;
        if (temp == 100) mon.avisaEvaporacao();
    }

    // Propriedade
    public int getTemperatura() { // em vez de temperatura() para seguir o padrão JavaBeans
        return temp;
    }

    // CONSULTA (TEM RETORNO)
    // JavaBean: retorno booleano prefixo is
    public boolean isCongelada() { // método calculado
        return temp <= 0;
    }

    public boolean isLiquida() {
        return ! isCongelada() && ! isGasosa();
    }

    public boolean isGasosa() {
        return temp >= 100;
    }

}