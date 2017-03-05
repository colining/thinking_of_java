package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by asus on 2017/3/5.
 */
public class DynamicProxy implements InvocationHandler {
    private Object obj; //objΪί�������
    public DynamicProxy(Object obj) {
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       // System.out.println("before");
        try {
            Class c = Class.forName("Proxy.Sell");
            Method method1 = c.getMethod("sell", null);
            Class c2 = Class.forName("Proxy.Sell");
            Method method2 = c2.getMethod("ad",null);
            if (method.equals(method1)) {
                System.out.println("���������ڵ���sell����");
            }
            if (method.equals(method2)) {
                System.out.println("���������ڵ���ad����");
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }
        Object result = method.invoke(obj, args);
       // System.out.println("after");
        return result;
    }
    public  static  void  main(String [] arg)
    {
        DynamicProxy inter = new DynamicProxy(new Vendor());
        Sell sell = (Sell)(Proxy.newProxyInstance(Sell.class.getClassLoader(),new  Class[]{Sell.class},inter));
        sell.sell();
        sell.ad();
     
    }
}