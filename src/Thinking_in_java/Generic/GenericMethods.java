package Thinking_in_java.Generic;

import Newcoder.HelloA;

/**
 * Created by asus on 2017/3/9.
 */
public class GenericMethods {
    public  <T> void  f(T x)
    {
        System.out.println(x.getClass().getName());
    }
    public  static  void  main(String [] arg)
    {
        GenericMethods genericMethods = new GenericMethods();
        genericMethods.f("");
        genericMethods.f(1);
        genericMethods.f(new HelloA());
    }
}
