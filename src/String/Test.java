package String;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by asus on 2017/3/4.
 */
class  Test {
    public  static  void  main(String arg[])
    {
        String a;
        StringBuilder [] builders = new  StringBuilder[3];
        StringBuilder a1=new StringBuilder("aaa");
        builders[0]=a1;
        StringBuilder a2 = a1;
        builders[1]=a2;
        StringBuilder a3 = a2;
        a3.append("bbb");
        builders[2]=a3;
        System.out.println(Arrays.toString(builders));

    }
}