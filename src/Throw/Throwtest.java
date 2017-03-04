package Throw;

import java.io.IOException;

/**
 * Created by asus on 2017/3/2.
 */
public class Throwtest {
    void  a () throws IOException
    {

    }
    void  b ()
    {
        try {
            a();
        }
        catch (IOException e)
        {

        }
    }
    public  static  void  main (String a[]) throws  Exception
    {

//        Throwtest throwtest = new Throwtest();
//        throwtest.testa(0);
    }

    public Throwtest() {
    }
    public int testa(int a)
    {
        try {
            System.err.println(11111);
            int b = a/0;
            System.out.println("ooo");
//            if (a == 0) {
//                throw new NullPointerException("kkk");
//
//
//            }
        }catch (NullPointerException e)
        {

        }
        return  1;
    }
}
