package proxy.dynamic_proxy.cglib;

import proxy.dynamic_proxy.RealSubject;
import proxy.dynamic_proxy.Subject;

public class Main {

    public static void main(String[] args) {

        Subject subject = MyCglibDynamicProxy.getInstance().getProxy(RealSubject.class);

        String method1 = subject.method1();
        System.out.println(method1);
        System.out.println();


        subject.method2();
        System.out.println();


        int method3 = subject.method3(100);
        System.out.println(method3);

    }
}
