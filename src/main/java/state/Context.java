package state;

/**
 * 上下文（状态持有者）
 */
public class Context {
    private State state;

    public String getState() {
        return state.getState();
    }

    public void setState(State state) {
        this.state = state;
    }
}
