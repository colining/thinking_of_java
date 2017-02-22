package com.company;

/**
 * Created by asus on 2017/2/20.
 */
public class Test extends  Mouse {
    public Test(String myName, int myid) {
        super(myName, myid);
    }
    public void testfloat(float a)
    {
        System.out.println("lll");
    }
    public  void  testdouble(double a)
    {
        System.out.println("222");
    }
    protected void  finalize() throws Throwable {
        System.out.println("ss");
        super.finalize();
    }

}
