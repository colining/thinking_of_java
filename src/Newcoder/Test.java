package Newcoder;


/**
 * Created by asus on 2017/3/5.
 */
 public abstract  class Test extends  HelloB
{
     public void a()
    {
        
        System.out.println("a");
    }
    public  static  void  main(String [] arg)
    {
//        String a = "hello";
//        String b = "hello";
//        char c[] = {'h', 'e', 'l', 'l', 'o'};
//        a.equals(b);
//        a.equals("hello");
//        a.equals(c);
//        c.equals(a);
//        a.equals(new String("hello"));
        String test = new String("hello");
        System.out.println(test == "hello");
    }
}


