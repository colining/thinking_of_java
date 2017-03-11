package Thinking_in_java.Generic;

/**
 * Created by asus on 2017/3/9.
 */
public class Holder1 {
    private  Automobile a;
    public  Holder1(Automobile a)
    {
        this.a=a;
    }
    Automobile get()
    {
        return  a;
    }



    private  Object b;
    public  Holder1(Object b)
    {
        this.b=b;
    }
    public  void  setB(Object b)
    {
        this.b = b;
    }
    public Object getB() {
        return b;
    }
}
