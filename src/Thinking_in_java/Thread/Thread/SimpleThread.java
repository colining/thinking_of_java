package Thinking_in_java.Thread.Thread;

/**
 * Created by asus on 2017/3/12.
 */
public class SimpleThread extends  Thread {

    public SimpleThread() {

        start();
        Thread.currentThread().setName("la");
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());
        super.run();
    }
    public  static  void  main(String []arg)
    {
        SimpleThread a= new SimpleThread();
        a.setName("hello");
        System.out.println(Thread.currentThread().getName());
    }
}
