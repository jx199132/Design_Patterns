package observe;

public class Main {
    public static void main(String[] args) {
        Watched transporter = new Transporter();

        Watcher police = new Police();
        Watcher security = new Security();
        Watcher thief = new Thief();

        transporter.addWatcher(police);
        transporter.addWatcher(security);
        transporter.addWatcher(thief);

        transporter.notifyWatchers();
    }
}
