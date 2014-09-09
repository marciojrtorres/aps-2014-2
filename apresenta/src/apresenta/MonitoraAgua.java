package apresenta;

import modelo.AguaListener;
import modelo.StateChangeEvent;
import modelo.TempChangeEvent;
import modelo.State;

public class MonitoraAgua implements AguaListener {

    public void stateChange(StateChangeEvent evt) {
        if (evt.getActualState() == State.GASOSA) {
            System.out.println("Agua evaporou");
        }
        // demais estados
    }

    public void tempChange(TempChangeEvent evt) {
        // nada por enquanto
    }

}