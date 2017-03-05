package Proxy;

/**
 * Created by asus on 2017/3/5.
 */
public class TestProxy {
    public  static  void  main(String [] arg)
    {
//     Subject subject = new SubjectProxy();
//        subject.doSomething();
//
        ProxyHandler proxyHandler = new ProxyHandler();
        Subject subject1 = (Subject)proxyHandler.bind(new RealSubject());
        subject1.doSomething();
    }
}
