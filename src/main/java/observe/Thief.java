package observe;

public class Thief implements Watcher {
    @Override
    public void receiveNotification() {
        System.out.println("运输车上路了，强盗伺机下手");
    }
}
