package observe;

/**
 * 抽象观察者
 */
public interface Watcher {

    /**
     * 收到通知
     */
    void receiveNotification();
}
