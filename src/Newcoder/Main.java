package Newcoder;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by asus on 2017/3/11.
*/

public class Main {
    static  int my[] = new int[10];
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    fun(a);
    for (int i=0;i<10;i++)
    {
        if (i==9)
            System.out.print(my[i]);
        else
        System.out.print(my[i]+" ");
    }


}
//public  static  void fun1(int num)
//{
//    int digst = (int) Math.log10(num);
//    int t = num;
//    int zero = 0;
//
//
//    while ( digst !=0)
//    {
//        t/= Math.pow(10,digst);
//
//        if (t!=0)
//        {
//            num -= t*Math.pow(10,digst);
//            for (int i =0 ; i<10 ; i++)
//            {
//                my[i] += t*f(num);
//            }
//        }
//        my[t--]+= num+1;
//
//        while (t>=0)
//        {
//            my[t--]+=Math.pow(10,digst);
//        }
//        zero+= Math.pow(10,digst);
//        if (num<10 && digst==1)
//        {
//            for ( int i = 0; i<=num;i++)
//                my[i]++;
//            num = 0;
//        }
//        t=num;
//        digst--;
//
//    }
//    my[0]-= (zero+1);
//    return;
//}
    public  static  int fun(int a)
    {
        int digit = (int) Math.log10(a);                    //位数，少一
        if (digit<=0)
        {
            for (int j = a; j >=0; j--)
            {
                my[j]++;

                }
               my[0]--;
            return 0;
        }
        int x = (int) (a / Math.pow(10, digit));           //最高位数值
        for (int i =0 ;i<=9;i++)                           //相等的部分
        {
            my[i]+=x*f(digit);
        }

        my[x] += 1 + a - (x * Math.pow(10, digit));        //当前最高位有这么多个

        for (int i = x-1; i >0; i--) {                    //给最高位以前赋值
            my[i]+=(int) Math.pow(10,digit);
        }

       a %= (x*Math.pow(10,digit));
        if (a==0)
        {
           my[0]+=digit;
            for (int i=digit;i>=1;i--) {
                my[0] -= (Math.pow(10, i - 1));
            }

            return 0;
        }
        if (Integer.toString(a).length()!=digit&&digit!=1)
        {
            //System.out.println("la");

            for (int i = digit;i>Integer.toString(a).length();i--) {
                my[0]+=a+1;
                my[0] -= (Math.pow(10, i - 1));
            }
            {
                my[0]+=digit-Integer.toString(a).length()-2;
            }
            return  fun(a);
        }
        //System.out.println(a);
        my[0]-=(Math.pow(10,digit-1));
        return   fun(a);

    }

//    public  static  int fun1(int x,int a, int digit)
//    {
//
//        my[x] += 1 + a - (x * Math.pow(10, digit));        //当前最高位有这么多个
//
//        for (int i = x-1; i >= 0; i--) {
//            my[i]+=(int) Math.pow(10,digit+1);
//        }
//        a %= (x*Math.pow(10,digit));
//        digit--;
//        if (digit==0)
//        {
//            my[a]++;
//            return  0;
//        }
//         x = (int) (a / Math.pow(10, digit));
//        return fun1(x,a,digit);
//    }

    public  static  int f(int i)
    {
        return (int)(i*Math.pow(10,i-1));
    }
}
