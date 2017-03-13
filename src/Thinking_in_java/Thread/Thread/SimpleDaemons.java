package Thinking_in_java.Thread.Thread;

import java.util.concurrent.TimeUnit;

/**
 * Created by asus on 2017/3/12.
 */
public class SimpleDaemons implements  Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        try {
            while (true)
            {
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.println(Thread.currentThread()+""+this);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("interrupt");
        }
        finally {
            System.out.println("finally");
        }
    }
    public  static  void  main(String []arg) throws InterruptedException {
        for (int i=0;i<10;i++)
        {
            Thread deamon = new Thread(new SimpleDaemons());
            deamon.setDaemon(true);
            deamon.start();
        }
        System.out.println("all daemon started");
        TimeUnit.SECONDS.sleep(5);
    }

}
