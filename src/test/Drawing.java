package test;

/**
 * Created by asus on 2017/2/25.
 */
public class Drawing extends  Art {
   Drawing (String i)
    {
       super(5);
//        super(i);
        System.out.println("Drawing Constructor");
    }
    Drawing (int i )
    {
        super(i);
    }

    Drawing()
    {
        super(5);
    }
}
