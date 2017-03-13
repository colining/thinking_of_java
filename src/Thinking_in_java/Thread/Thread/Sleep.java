package Thinking_in_java.Thread.Thread;

/**
 * Created by asus on 2017/3/12.
 */
public class Sleep extends  Thread {
    private  int sleep;
    public  Sleep(String name , int a)
    {
        super(name);
        sleep=a;
        start();
    }
    public  void  run()
    {

        try {

            sleep(sleep);
        } catch (InterruptedException e) {
            System.out.println(getName()+"was interrupt"+isInterrupted());
            return;
        }
        System.out.println(getName() + "has weaken");
    }
}
