package Thinking_in_java.Thread.Synchronized;

import java.sql.Time;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by asus on 2017/3/14.
 */
public class  Mytest3 implements  Runnable {
  volatile static int a=0;
        public synchronized void a() throws InterruptedException {
            Thread.sleep(5000);

        }
        public   synchronized void  b()
        {

        }
    @Override
    public void run() {
        int a = (int) (Math.random()*10);

        //synchronized (this) {
            for (int i = 0; i < 5; i++) {
                if (a>5) {
                    System.out.println(Thread.currentThread().getName()+" 先做a");
                    try {
                        a();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"a完成");
                    System.out.println("a完成");
                    b();
                }
                else
                {
                    System.out.println(Thread.currentThread().getName()+" 先做b");
                    b();
                    System.out.println("b完成");
                    try {
                        a();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                //}
        }

    }
    public  static  void main(String []arg) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Mytest3 mytest3 = new Mytest3();
//        for (int i=0;i<10;i++)
//            executorService.execute(mytest3);
//
        TimeUnit.MILLISECONDS.sleep(5);
        Thread.currentThread().interrupt();

    }
}
