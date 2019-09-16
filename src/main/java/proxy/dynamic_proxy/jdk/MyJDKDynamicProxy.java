package proxy.dynamic_proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyJDKDynamicProxy implements InvocationHandler {

    private Object subject;

    public MyJDKDynamicProxy(Object subject) {
        this.subject = subject;
    }

    /**
     * 获取被代理接口实例对象
     *
     * @param <T>
     * @return
     */
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), this);
    }

    /**
     * 通过实例对象进行接口调用
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Do something before");
        Object invoke = method.invoke(subject, args);
        System.out.println("Do something after");
        return invoke;
    }
}
