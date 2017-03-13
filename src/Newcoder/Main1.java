package Newcoder;

import java.util.Scanner;

/**
 * Created by asus on 2017/3/11.
*/

public class Main1 {
    static  int my[] = new int[10];
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    fun1(a);
    for (int i = 0; i < 10; i++) {
        if (i == 9)
            System.out.print(my[i]);
        else
            System.out.print(my[i] + " ");
    }

}
//    public  static  int fun(int a)
//    {
//        int digit = (int) Math.log10(a);                    //位数，少一
//        if (digit<=0)
//        {
//            for (int j = a; j >=0; j--)
//            {
//                my[j]++;
//
//                }
//               my[0]--;
//            return 0;
//        }
//        int x = (int) (a / Math.pow(10, digit));           //最高位数值
//        for (int i =0 ;i<=9;i++)                           //相等的部分
//        {
//            my[i]+=x*f(digit);
//        }
//
//        my[x] += 1 + a - (x * Math.pow(10, digit));        //当前最高位有这么多个
//
//        for (int i = x-1; i >0; i--) {                    //给最高位以前赋值
//            my[i]+=(int) Math.pow(10,digit);
//        }
//
//       a %= (x*Math.pow(10,digit));
//        if (a==0)
//        {
//           my[0]+=digit;
//            for (int i=digit;i>=1;i--) {
//                my[0] -= (Math.pow(10, i - 1));
//            }
//
//            return 0;
//        }
//        if (Integer.toString(a).length()!=digit&&digit!=1)
//        {
//            for (int i = digit;i>Integer.toString(a).length();i--) {
//                my[0]+=a+1;
//                my[0] -= (Math.pow(10, i - 1));
//            }
//            {
//                my[0]+=digit-Integer.toString(a).length()-2;
//            }
//            return  fun(a);
//        }
//        my[0]-=(Math.pow(10,digit-1));
//        return   fun(a);
//
//    }
    /*
   1. 简单地说就是补0,以2101为例，他有两个相同的部分就是000~999,1000~1999；这两个区间
    所有数字的个数是一样的（因为有001,002，所以随后要减去0的个数），忽略首位，1999不算1的
    2.那么除了相同的部分，在大于2000的部分；算首位，1自然出现了1000次，2自然出现了101次+2000
    本身（+1）；这样第一位就算完了；继续算第二位；
    第二位也是重复上面的相同操作
    因为求余数的计算，中间的0会被忽略掉，也就是没做有多少个首位，和减去多少个多算的0；所以要单独操作；
     */
  public  static   void  fun1( int num)
    {
        int digit = (int) Math.log10(num);                    //位数，比实际少一位
        while (digit>=0) {                                      //位数要大于0

            int high = (int) (num / Math.pow(10, digit));           //最高位数值
            for (int i = 0; i <= 9; i++)                           //0000~9999这种大家相等的部分
            {
                my[i] += high * f(digit);
            }

            my[high] += 1 + num - (high * Math.pow(10, digit));        //当前最高位的这个数字有这么多个

            for (int i = high - 1; i >= 0; i--) {                    //给最高位以前赋值
                my[i] += (int) Math.pow(10, digit);
            }
            num %= (high * Math.pow(10, digit));                        //求下一位
            my[0]-=(Math.pow(10,digit));
            digit--;

            if (num==0&&digit<0)                                      //如果都等于0就跳出
                return;
            int zero =  (digit-(int) Math.log10(num));           //中间位0的判断，因为求余数会忽略0
            if (zero>=1) {
                int b =  (digit - (int)Math.log10(num)) - 1;
                for (int i = b; i >= 0; i--) {
                    my[0]-=(Math.pow(10,digit));
                    digit--;
                    my[0]+=num+1;                                     //中间位有多次0的话，就加多次
                }

            }


        }
    }

    public  static  int f(int i)
    {
        return (int)(i*Math.pow(10,i-1));
    }
}
