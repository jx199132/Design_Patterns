package observe;

public class Police implements Watcher {
    @Override
    public void receiveNotification() {
        System.out.println("宝物上路了，警察跟上护航");
    }
}
