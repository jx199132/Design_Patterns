package observe;

import java.util.LinkedList;
import java.util.List;

/**
 * 具体的被观察者 - 宝物
 */
public class Transporter implements Watched {

    private List<Watcher> watcherList = new LinkedList<>();

    @Override
    public void addWatcher(Watcher watcher) {
        watcherList.add(watcher);
    }

    @Override
    public void removeWatcher(Watcher watcher) {
        watcherList.remove(watcher);
    }

    @Override
    public void notifyWatchers() {
        watcherList.forEach(Watcher::receiveNotification);
    }
}
