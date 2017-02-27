package test2;

import net.mindview.util.Print;

/**
 * Created by asus on 2017/2/27.
 */
public class Apply {
    public  static  void  process(Processor p , Object s)
    {
        System.out.println(p.name());
        System.out.println(p.process(s));
    }
    public  static  void  main(String a[])
    {
       String s =  "GGGGGggggGGGG";
        process(new Downcase(),s);
    }
}
