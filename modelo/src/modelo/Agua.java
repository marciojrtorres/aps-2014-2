package modelo;

import java.util.*;

public class Agua {

    private int temp;

    // eh padrao ter uma lista de ouvintes
    private List<AguaListener> listeners = new ArrayList<>();

    public Agua(int temp) {
        this.temp = temp;
    }

    // eh padrao o metodo addListener
    public void addAguaListener(AguaListener listener) {
        this.listeners.add(listener);
    }

    // eh padrao o metodo removeListener
    public void removeAguaListener(AguaListener listener) {
        this.listeners.remove(listener);
    }

    public void esfriar() { // comando: altera o estado
        temp = temp - 1; // temp -= 1; temp--;
    }

    public void aquecer() { // comando: altera o estado
        temp = temp + 1;
        // perceber o evento
        if (temp == 100) {
            // criar o objeto evento
            StateChangeEvent stateChangeEvent =
                new StateChangeEvent(State.LIQUIDA, State.GASOSA);
            // avisar todos os listeners
            for (AguaListener listener : listeners) {
                listener.stateChange(stateChangeEvent);
            }
        }
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

    @Override
    public String toString() {
        return "Agua " + temp + "o";
    }

}