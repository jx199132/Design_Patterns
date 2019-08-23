package observe;

public class Security implements Watcher {

    @Override
    public void receiveNotification() {
        System.out.println("运输车上路了，保镖跟上");
    }
}
