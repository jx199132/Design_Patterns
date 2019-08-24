package state;

public class StealthState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("隐身了");
        context.setState(this);
    }

    @Override
    public String getState() {
        return "stealth";
    }
}
