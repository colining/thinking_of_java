package String;

import java.util.Formatter;

/**
 * Created by asus on 2017/3/4.
 */
public class Receipt {
    Formatter formatter = new Formatter(System.out);
    public  void  printtest()
    {
        formatter.format("%15s %5d %10.3f\n","this is a test",10,3.1564*3);
        formatter.format("%15s %5d %10.2f\n","this ",10,3.1*3);
    }
    public  static  void  main(String a[])
    {
        Receipt receipt =new Receipt();
        receipt.printtest();
    }

}
