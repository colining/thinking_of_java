package Thinking_in_java.Thread.Synchronized;

import java.sql.Time;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by asus on 2017/3/13.
 */
public class Mytest implements  Runnable {
   private   int  a=0;
    private  volatile static boolean b=false;
   private  test test ;

    public Mytest(Thinking_in_java.Thread.Synchronized.test test) {
        this.test = test;
    }

    void  a()
    {
        ++a;
        //Thread.yield();
    }
    void  b()
    {
        ++a;
        //Thread.yield();
    }
  public void  c()
  {
        ++a;
      Thread.yield();
      for (int i=0; i<10000;i++);
        ++a;
    }

    public  static  void  main(String []arg)
    {
        ExecutorService executorService = Executors.newCachedThreadPool();
        System.out.println("Press Control-C to exit");
        for (int i =0;i<20;i++) {
            executorService.execute(new Mytest(new test()));
        }
        executorService.shutdown();
    }

    @Override
    public void run() {

        while (!b)
        {
            a();

            try {
                Thread.sleep((long) (Math.random()*10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread.yield();
            b();
            //System.out.println(a);
            if (a%2!=0) {
                b = true;
            }

        }
        while (test.isTf())
        {
           int a= test.a();
            if (a%2!=0)
            {
                System.out.println("lala");
                test.setTf(false);
            }
        }


    }
}
class  test
        {
            public boolean isTf() {
                return tf;
            }

            public void setTf(boolean tf) {
                this.tf = tf;
            }

            private  volatile  boolean tf=true;
            private int a=0;
           public int a()
            {
                ++a;
                Thread.yield();

                ++a;
                return  a;
            }
        }
