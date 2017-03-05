package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by asus on 2017/3/5.
 */
public class ProxyHandler implements InvocationHandler {
    private  Object tar;
    public  Object bind(Object tar)
    {
        this.tar=tar;
        return Proxy.newProxyInstance(tar.getClass().getClassLoader(),tar.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       Object object = null;
        object = method.invoke(tar,args);
        return object;
    }
}
