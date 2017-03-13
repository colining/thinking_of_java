package Thinking_in_java.Thread.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by asus on 2017/3/12.
 */
public class Priority  implements  Runnable{
    public  static  void  main(String []arg)
    {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i=0;i<5;i++)
        {
            executorService.execute(new Priority(Thread.MIN_PRIORITY));
        }
        executorService.execute(new Priority(Thread.MAX_PRIORITY));
        executorService.shutdown();
    }
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
    private  volatile  double d;
    private  int priority;
    private  int countdown=5;
    public  Priority(int priority)
    {
        this.priority = priority;
    }
    public  String toString()
    {
        return  Thread.currentThread() + " :"+countdown;
    }
    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);
        while (true) {
            for (int i = 1; i < 100000; i++) {
                d += (Math.PI + Math.E) / (double) i;
                if (i % 1000 == 0)
                    Thread.yield();

            }
            System.out.println(this);
            if (--countdown == 0)
                return;
        }

    }
}
