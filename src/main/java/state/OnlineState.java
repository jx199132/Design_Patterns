package state;

public class OnlineState implements State{

    @Override
    public void doAction(Context context) {
        System.out.println("上线了");
        context.setState(this);
    }

    @Override
    public String getState() {
        return "online";
    }
}
