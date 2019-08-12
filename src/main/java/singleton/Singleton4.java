package singleton;

/**
 * 懒汉式 - 内部类延迟加载
 */
public class Singleton4 {
    private Singleton4() {}

    public static class Holder {
        static Singleton4 instance = new Singleton4();
    }

    public static Singleton4 getInstance() {
        // 外围类能直接访问内部类（不管是否是静态的）的私有变量
        return Holder.instance;
    }
} 