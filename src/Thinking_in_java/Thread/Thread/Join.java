package Thinking_in_java.Thread.Thread;

/**
 * Created by asus on 2017/3/12.
 */
public class Join extends  Thread {
    private  Sleep sleep;
    public  Join(String name ,Sleep sleep)
    {
        super(name);
       this.sleep=sleep;
        start();
    }
    public  void  run()
    {
        try {
            sleep.join();
        } catch (InterruptedException e) {
            System.out.println("interrupt");
        }
        System.out.println(getName() + " complete");
    }
    public  static  void  main(String []arg)
    {

        Sleep sleep = new Sleep("sleep",1000);
        Sleep grumy = new Sleep("g",1500);
        Join d = new Join("do",sleep);
        Join p = new Join("po",grumy);
       grumy.interrupt();
    }
}
