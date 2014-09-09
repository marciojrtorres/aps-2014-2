package apresenta;

import modelo.*;

public class Main {
    public static void main(String[] args) {

        // Observador / Ouvinte / Inscrito
        MonitoraAgua mon = new MonitoraAgua();

        //MonitoraAguaAperfeicoado mona = new MonitoraAguaAperfeicoado();

        // Observado / Fonte de Evento / Publicador
        Agua a = new Agua(25);

        a.addAguaListener(mon);
        a.addAguaListener(new AguaListener() {
            public void stateChange(StateChangeEvent evt) {
                if (evt.getActualState() == State.GASOSA) {
                    javax.swing.JOptionPane
                        .showMessageDialog(null, "EVAPOROU");
                }
            }

            public void tempChange(TempChangeEvent evt) {
                // nada por enquanto
            }
        });

        while (!a.isGasosa()) {
            a.aquecer();
            System.out.println(a.getTemperatura());
        }

        // callback (retorno)
        // princípio hollywood (não me ligue eu ligo para você)

        // essas instruções deve acontecer quando
        // trocar de estado, mas não podem ficar no main
        // obs.: só na troca
        // System.out.println("AGUA EVAPOROU");  // liq->gas
        // System.out.println("AGUA CONGELOU");  // liq->sol
        // System.out.println("AGUA LIQUEFEZ");  // sol->liq
        // System.out.println("AGUA CONDENSOU"); // gas->liq
    }
}
