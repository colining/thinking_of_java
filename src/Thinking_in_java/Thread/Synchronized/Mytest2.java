package Thinking_in_java.Thread.Synchronized;

import Thinking_in_java.Thread.Thread.Sleep;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by asus on 2017/3/13.
 */
public class Mytest2 implements Runnable {
    static test2 test2;
    private int a = 0;
    private volatile static boolean b = true;
    Mytest2 mytest2;
    private Lock lock = new ReentrantLock();

    public void test() {
        System.out.println(mytest2);
    }

    public Mytest2(test2 test2) {

        this.test2 = test2;
        mytest2 = this;

    }

    public  void a() {
        a += 2;
//        Thread.yield();
//        ++a;
    }

    public void b() {
        a += 3;
    }

    public synchronized void c() {
//        a();
//        b();
        a += 3;
        //Thread.yield();
        a += 2;
    }

    private void d() {
        synchronized (Mytest2.class) {
            ++a;
            ++a;
        }
        //System.out.print(Thread.currentThread().getName()+" ");
    }

    private void e() {
        lock.lock();
        ++a;
        Thread.yield();
        ++a;
        lock.unlock();
    }

    public static void main(String[] arg) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        test2 test2 = new test2();
        Mytest2 mytest2 = new Mytest2(test2);
        Thread thread = new Thread(mytest2);
        for (int i = 0; i < 2; i++) {
            executorService.execute(mytest2);
            //Thread.sleep(1000);
        }
        executorService.shutdown();
    }

    @Override
    public void run() {
//        while (b) {
//            //synchronized (this) {
                a();
                Thread.yield();
                b();
//            //}
////            c();
//        synchronized (this) {
//
//            for (int i = 0; i < 500; i++) {
//                e();
//
//                if (a % 2 != 0) {
//                    System.out.println(a);
//                }
//            }
//       }

//                    e();
//                    System.out.println(a);
//                    for (int i=0;i<5000;i++)
//                    {
//                        System.out.println(Thread.currentThread().getName());
//                        test();
//                    }
//        for (int i=0;i<5000;i++) {
//            mytest2.d();
//            if (a % 2 == 1) {
//                System.out.println(a + " " + Thread.currentThread().getName());
//                b = false;
//            }
//        }

//        for (int i=0;i<1000000;i++) {
//            int val = test2.next();
//            if (val % 2 != 0) {
//                System.out.println("vallalalal");
//            }
  // }

//        }
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
