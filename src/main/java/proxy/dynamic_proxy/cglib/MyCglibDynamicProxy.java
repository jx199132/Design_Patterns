package proxy.dynamic_proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyCglibDynamicProxy implements MethodInterceptor {

    private static MyCglibDynamicProxy instance = new MyCglibDynamicProxy();

    public static MyCglibDynamicProxy getInstance() {
        return instance;
    }

    public <T> T getProxy(Class<T> cls) {
        return (T) Enhancer.create(cls, this);
    }

    @Override
    public Object intercept(Object target, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Do something before");
        Object result = methodProxy.invokeSuper(target, args);
        System.out.println("Do something after");
        return result;
    }
}
