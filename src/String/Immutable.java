package String;

/**
 * Created by asus on 2017/3/3.
 */
public class Immutable {
    public  static  String upcase(String s)
    {
        return  s.toUpperCase();
    }
    public  static  void  main(String a[])
    {
        String q ="howdy";
        System.out.println(q);
        //String qq = new String("aaaa");
        String qq = upcase(q);
        q = upcase(q);
        System.out.println(qq);
        System.out.println(q);
    }
}
