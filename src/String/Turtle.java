package String;

//import com.sun.java.util.jar.pack.Package;
import com.sun.org.apache.bcel.internal.classfile.Code;

import java.io.PrintStream;
import java.util.Formatter;
import java.lang.Class;

/**
 * Created by asus on 2017/3/4.
 */

public class Turtle {
    private  String name;
    private Formatter formatter;
    public  Turtle (String name, Formatter f)
    {
        this.name = name;
        this.formatter = f;
    }
    public  void  move ( int x , int y)
    {
        formatter.format("%s  The Turtle is at (%d,%d)\n",name,x,y);

    }
    public  static void main(String a[])
    {
        Class class1 =Code.class;

        PrintStream stream = System.err;
        Turtle turtle = new Turtle("tommy",new Formatter( System.out));
        Turtle turtle1 = new Turtle("tom",new Formatter(System.err));
        turtle.move(5,6);
        turtle.move(6,8);
        turtle1.move(9,0);
        Class class2 = turtle.getClass();


    }
}
