package Thinking_in_java.Generic;

import Newcoder.HelloB;
import com.company.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by asus on 2017/3/9.
 */
public class Holder2<T> {
    private  T a;


    public Holder2(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }
    public  static  void  main(String []arg)
    {
        ArrayList<Holder1> arrayList= new ArrayList<>();
      //  Map<HelloB,List< ? extends Animal>> map
    }
}
