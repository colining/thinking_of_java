package test;

/**
 * Created by asus on 2017/2/25.
 */
public class Art {
   String a = "aaaaa";
    public static  void  main (String a[])
    {
        Art art = new Drawing();
        art.test1();
    }
//    Art (int i)
//    {
//        System.out.println("Art Constructior");
//    }
    Art ()
    {
        System.out.println("art");
    }
   void test()
    {
        System.out.println("art");
    }
    private void test1()
    {
        System.out.println("test1");
    }
}
