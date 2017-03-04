package String;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 2017/3/4.
 */
public class InfiniteRecursion {
    public  String toString()
    {

    return  super.toString();
    }
    public  static void  main(String [] arg)
    {
        List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
        for (int i =0; i<10; i++)
        {
            v.add(new InfiniteRecursion());
            System.out.println(v);
        }
    }
}
