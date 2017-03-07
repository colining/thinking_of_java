import java.util.Scanner;

/**
 * Created by asus on 2017/3/7.
 */
public class Main {
    public static  void  main(String []arg)
    {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int la=scanner.nextInt();
        for (int i=la;i<=100;i++)
        {
            int b=(int) Math.floor(a/i);
           // System.out.println(b);
            int test=b;
           // System.out.println("lalla");
            int key=0;
            for (int j =i,h=1;j>0;j--)
            {

                int k=i%j;
                //System.out.println("k="+k);
                if (k%2==0)
                {
                   // System.out.println("+");
                    int b1=test+h;
                    b+=b1;
                  //  System.out.println(b);

                }
                else
                {
                  //  System.out.println("-");
                    int b1=test-h;
                    b+=b1;
                    h++;
                    if (test-h<=0) {
                        key=1;
                        break;

                    }
                    //System.out.println(b);
                }
                if (b<0)
                {
                    continue;
                }
                if (b==a) {
                   // System.out.println("可以分为" + test);
                    key=1;
                  //  System.out.println("i-j"+(i - j));
                    print(test,i-j);
                    break;
                }
            }
            if (key==1)
            {

               continue;
            }
            if (i==100)
                System.out.println("NO");
        }

    }
    public static void  print(int a,int b)
    {
        int test= a-(b+1)/2;
        for (int i = 0;i<b+2;i++)
        {

            System.out.print(test);
            if (i<b+1)
                System.out.print(" ");
            test++;
        }
//        int key=0;
//        for (int i =0 ,h=0;i<b+2;i++)
//        {
//
//            System.out.println(a+h);
//            if (key==0)
//            {
//                Math.abs(h);
//                h++;
//                key=1;
//            }
//            else
//            {
//              h=0-h;
//                key=1;
//            }
//        }
    }
}
