package Newcoder;

/**
 * Created by asus on 2017/3/5.
 */
public class HelloB extends HelloA{
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
    public static void main (String[] args){
        new HelloB();
    }
}
