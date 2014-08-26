package apresenta;

import modelo.IMonitoraAgua;

public class MonitoraAgua implements IMonitoraAgua {

    public void avisaEvaporacao() {
        System.out.println("AGUA EVAPOROU");
    }

}