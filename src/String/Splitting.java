package String;

import java.util.Arrays;

/**
 * Created by asus on 2017/3/4.
 */
public class Splitting {
    public  static  String knight = "n.n.n.n.n";
    public  static  void  split (String regex)
    {
        System.out.println(Arrays.toString(knight.split(regex)));
    }
    public  static  void  main (String []a )
    {
        split("n\\W+");
    }
}
