package proxy.dynamic_proxy.jdk;

import proxy.dynamic_proxy.RealSubject;
import proxy.dynamic_proxy.Subject;

public class Main {

    public static void main(String[] args) {

        // jdk动态代理测试
        Subject subject = new MyJDKDynamicProxy(new RealSubject()).getProxy();
        String method1 = subject.method1();
        System.out.println(method1);
        System.out.println();


        subject.method2();
        System.out.println();


        int method3 = subject.method3(100);
        System.out.println(method3);
    }
}
