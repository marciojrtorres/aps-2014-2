package modelo;

// ObservadoListener
public interface AguaListener {

    // AtributoEvento    // AtributoEventoEvent
    public void stateChange(StateChangeEvent evt);

    public void tempChange(TempChangeEvent evt);

}