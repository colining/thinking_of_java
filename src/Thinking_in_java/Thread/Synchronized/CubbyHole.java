package Thinking_in_java.Thread.Synchronized;

/**
 * Created by asus on 2017/3/13.
 */
public class CubbyHole {
    public void setContent(int content) {
        this.content = content;
    }

    private  int content;
    public  int getContent()
    {
        return content;
    }
}
class Producer extends  Thread
{
    private  CubbyHole cubbyHole;
    public Producer (CubbyHole c)
    {
        this.cubbyHole = c;
    }

    @Override
    public void run() {
        for (int i = 0;i<10;i++)
        {
            cubbyHole.setContent(i);
            System.out.println("put"+i);
            try {
                sleep((long) (Math.random()*10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class  Consumer extends  Thread
{
    private CubbyHole cubbyHole;

    public Consumer(CubbyHole cubbyHole) {
        this.cubbyHole = cubbyHole;
    }

    @Override
    public void run() {
      int v = 0;
        for ( int i = 0;i <10; i++)
        {
            v=cubbyHole.getContent();
            System.out.println("got" + v);
        }
    }
    public static void  main(String [] arg)
    {
        CubbyHole cubbyHole = new CubbyHole();
        Producer producer = new Producer(cubbyHole);
        Consumer consumer = new Consumer(cubbyHole);
        producer.start();
        consumer.start();
    }
}
