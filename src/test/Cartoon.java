package test;

/**
 * Created by asus on 2017/2/25.
 */
public class Cartoon extends  Drawing {
    Main main = new Main();

    Cartoon(int i) {
        super(i);
    }

    public  static  void  main(String arg[])
    {
        Cartoon x = new Cartoon(1);
    }
}
