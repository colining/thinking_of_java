package Thinking_in_java.Thread.Synchronized;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by asus on 2017/3/14.
 */
public class  Mytest3 implements  Runnable {
  volatile static int a=0;
        public synchronized void a()
        {
            ++a;
            Thread.yield();
            ++a;
        }
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 5000; i++) {
                a();
                if (a % 2 != 0) {
                    System.out.println("wrong");
                }
            }
        }

    }
    public  static  void main(String []arg)
    {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Mytest3 mytest3 = new Mytest3();
        for (int i=0;i<10;i++)
            executorService.execute(mytest3);

    }
}
