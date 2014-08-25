package modelo;

public class MonitoraAguaAperfeicoado extends MonitoraAgua {

    @Override
    public void avisaEvaporacao() {
        javax.swing.JOptionPane.showMessageDialog(null, "AGUA EVAPOROU");
    }

}