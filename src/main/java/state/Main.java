package state;

public class Main {

    public static void main(String[] args) {

        Context context = new Context();

        OnlineState onlineState = new OnlineState();
        onlineState.doAction(context);
        System.out.println("context 的 状态 是 ：" + context.getState());

        StealthState stealthState = new StealthState();
        stealthState.doAction(context);
        System.out.println("context 的 状态 是 ：" + context.getState());

        OfflineState offlineState = new OfflineState();
        offlineState.doAction(context);
        System.out.println("context 的 状态 是 ：" + context.getState());

    }
}
