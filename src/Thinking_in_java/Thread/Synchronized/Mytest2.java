package Thinking_in_java.Thread.Synchronized;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by asus on 2017/3/13.
 */
public class Mytest2 implements Runnable {
    static test2 test2;
    private   static int a=0;
    private  volatile  static  boolean b=true;
    public  Mytest2(test2 test2)
    {
        this.test2 = test2;
    }
    public   void  a()
    {
        a+=2;
//        Thread.yield();
//        ++a;
    }
    public   void  b()
    {
        a+=3;
    }
    public synchronized void  c()
    {
//        a();
//        b();
        a+=3;
        //Thread.yield();
        a+=2;
    }
 private   synchronized void  d()
    {
        ++a;
        ++a;
        //System.out.print(Thread.currentThread().getName()+" ");
    }
    public  static void  main(String [] arg)
    {
        ExecutorService executorService = Executors.newCachedThreadPool();
        test2 test2 = new test2();
        for (int i =0;i<100;i++)
        executorService.execute(new Mytest2(test2));
        executorService.shutdown();
    }
    @Override
    public void run() {
//        while (b) {
//            //synchronized (this) {
////                a();
////                Thread.yield();
////                b();
//            //}
////            c();
//            d();
//            if (a%2!=0) {
//                System.out.println(a + " " + Thread.currentThread().getName());
//                b=false;
//            }
        for (int i=0;i<1000000;i++) {
            int val = test2.next();
            if (val % 2 != 0) {
                System.out.println("vallalalal");
            }
        }
   // }
//           for (int i=0;i<2000;i++){
//                    d();
//                   int tag =a;
//                if (tag%2!=0) {
//                    System.out.println(a + " " + Thread.currentThread().getName());
//                    System.out.println("lalalallala");
//                }
//            }

    }
}
class  test2{
    public  static  int a = 0;
    public synchronized int next()
    {
        ++a;
        ++a;
        return  a;
    }
}
