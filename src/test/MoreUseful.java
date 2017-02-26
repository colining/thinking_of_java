package test;

/**
 * Created by asus on 2017/2/26.
 */
public class MoreUseful extends  Useful{
    public  static  void  main(String a[])
    {
        Useful [] x = {
                new Useful(),
                new MoreUseful()
        };
        x[0].f();
        x[1].g();
        ((MoreUseful)x[1]).h();
    }
    public  void  f()
    {

    }
    public  void  g()
    {

    }
    public  void  h()
    {

    }
}
