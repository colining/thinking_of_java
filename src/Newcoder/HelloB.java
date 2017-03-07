package Newcoder;

import java.io.BufferedReader;
import java.nio.Buffer;
import java.util.Iterator;

/**
 * Created by asus on 2017/3/5.
 */
public class HelloB extends HelloA{
    class  test{

    }
    static  int i;
    public HelloB()
    {
        System.out.println("I¡¯m B class");
    }
    static{
        System.out.println("static B");
    }
    {
        System.out.println("B");
    }
    public  void  a()
    {
        System.out.println(super.a);

    }
    public static void main (String[] args){
     
        HelloB b=new HelloB();
        System.out.println(b.b);
//        HelloB b = new HelloB();
//        int i=5;
//        int s=(i++)+(++i)+(i--)+(--i);
//        System.out.println(s);
        byte a1=2,a2=3;
        short b1=3;

//        System.out.println(Math.floor(-8.5));
//        String a1 = "abc"+"def";
//        String a2 = new String(a1);
//        String b1=new String(" ");
//        String b2 = new String(" ");
//        System.out.println(b1 == b2);
//        System.out.println(a1.equals(a2));
//        System.out.println(a1 == a2);
//        System.out.println(i);

    }
}
