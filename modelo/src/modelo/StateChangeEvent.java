package modelo;

// Evento carrega as informacoes
public class StateChangeEvent {

    private State previousState;
    private State actualState;

    public StateChangeEvent(State previousState, State actualState) {
        this.previousState = previousState;
        this.actualState = actualState;
    }

    public State getPreviousState() {
        return this.previousState;
    }

    public State getActualState() {
        return this.actualState;
    }

}