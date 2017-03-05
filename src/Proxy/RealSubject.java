package Proxy;

/**
 * Created by asus on 2017/3/5.
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("call doSomething");
    }
}
