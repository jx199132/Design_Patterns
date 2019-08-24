package state;

/**
 * 离线状态
 */
public class OfflineState implements State{

    @Override
    public void doAction(Context context) {
        System.out.println("离线了");
        context.setState(this);
    }

    @Override
    public String getState() {
        return "offline";
    }


}
