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
//        int digit = (int) Math.log10(a);                    //λ������һ
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
//        int x = (int) (a / Math.pow(10, digit));           //���λ��ֵ
//        for (int i =0 ;i<=9;i++)                           //��ȵĲ���
//        {
//            my[i]+=x*f(digit);
//        }
//
//        my[x] += 1 + a - (x * Math.pow(10, digit));        //��ǰ���λ����ô���
//
//        for (int i = x-1; i >0; i--) {                    //�����λ��ǰ��ֵ
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
   1. �򵥵�˵���ǲ�0,��2101Ϊ��������������ͬ�Ĳ��־���000~999,1000~1999������������
    �������ֵĸ�����һ���ģ���Ϊ��001,002���������Ҫ��ȥ0�ĸ�������������λ��1999����1��
    2.��ô������ͬ�Ĳ��֣��ڴ���2000�Ĳ��֣�����λ��1��Ȼ������1000�Σ�2��Ȼ������101��+2000
    ����+1����������һλ�������ˣ�������ڶ�λ��
    �ڶ�λҲ���ظ��������ͬ����
    ��Ϊ�������ļ��㣬�м��0�ᱻ���Ե���Ҳ����û���ж��ٸ���λ���ͼ�ȥ���ٸ������0������Ҫ����������
     */
  public  static   void  fun1( int num)
    {
        int digit = (int) Math.log10(num);                    //λ������ʵ����һλ
        while (digit>=0) {                                      //λ��Ҫ����0

            int high = (int) (num / Math.pow(10, digit));           //���λ��ֵ
            for (int i = 0; i <= 9; i++)                           //0000~9999���ִ����ȵĲ���
            {
                my[i] += high * f(digit);
            }

            my[high] += 1 + num - (high * Math.pow(10, digit));        //��ǰ���λ�������������ô���

            for (int i = high - 1; i >= 0; i--) {                    //�����λ��ǰ��ֵ
                my[i] += (int) Math.pow(10, digit);
            }
            num %= (high * Math.pow(10, digit));                        //����һλ
            my[0]-=(Math.pow(10,digit));
            digit--;

            if (num==0&&digit<0)                                      //���������0������
                return;
            int zero =  (digit-(int) Math.log10(num));           //�м�λ0���жϣ���Ϊ�����������0
            if (zero>=1) {
                int b =  (digit - (int)Math.log10(num)) - 1;
                for (int i = b; i >= 0; i--) {
                    my[0]-=(Math.pow(10,digit));
                    digit--;
                    my[0]+=num+1;                                     //�м�λ�ж��0�Ļ����ͼӶ��
                }

            }


        }
    }

    public  static  int f(int i)
    {
        return (int)(i*Math.pow(10,i-1));
    }
}
