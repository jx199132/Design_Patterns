package state;

public class Context {
    private State state;

    public String getState() {
        return state.getState();
    }

    public void setState(State state) {
        this.state = state;
    }
}
