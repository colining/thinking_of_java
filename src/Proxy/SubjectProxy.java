package Proxy;

/**
 * Created by asus on 2017/3/5.
 */
public class SubjectProxy implements Subject {
    Subject subject = new RealSubject();
    @Override
    public void doSomething() {
        subject.doSomething();
    }
}
