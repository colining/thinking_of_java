package Thinking_in_java.Generic.Erase;

import Thinking_in_java.Generic.Holder1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 2017/3/9.
 */
public class Foo<T> {
    T a;
    List<T> create (T t,int n)
    {
        List<T> result = new ArrayList<T>();
        for (int i = 0;i< n ;i++) {
            result.add(t);
        }
            return result;

    }
    public  String toString()
    {
        return  a.getClass().getName();
    }
    public static void  main(String []arg)
    {
        Foo<Holder1> holder1Foo= new Foo<>();
        Foo<String> foo = new Foo<>();
      List<String> list=  foo.create("hello",4);
        System.out.println(list);
        System.out.println(holder1Foo.getClass().getName());
        System.out.println(holder1Foo.toString());
    }
}
