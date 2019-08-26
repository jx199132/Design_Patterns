package proxy.dynamic_proxy;

public class RealSubject implements Subject {

    @Override
    public String method1() {
        System.out.println("method1 running...");
        return "aaa";
    }

    @Override
    public void method2() {
        System.out.println("method2 running...");
    }

    @Override
    public int method3(int x) {
        return x;
    }

}