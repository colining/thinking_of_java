package Thinking_in_java.Thread.Thread;

import java.util.concurrent.TimeUnit;

/**
 * Created by asus on 2017/3/12.
 */
public class Liftoff  implements  Runnable{
    protected  int countDown = 10;
    private  static  int taskCount = 0;
    private  final  int id = taskCount++;
    public  Liftoff(){}
    public Liftoff(int countDown)
    {
        this.countDown = countDown;
    }
    public  String status()
    {
        return  "#"+id +"( "+(countDown>0 ? countDown :"liftoff")+"),";
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


    @Override
    public void run() {
    while (countDown-- >0)
        System.out.print(status());
        try {
            TimeUnit.MILLISECONDS.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread.yield();
    }
}
