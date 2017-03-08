/**
 * Created by asus on 2017/3/8.
 */


import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int x = 0;
        int i = L;
        int j = 0;
        for (; i <= 100; i++) {
            if ((N - i * (i - 1) / 2) % i == 0)
                x = (N - i * (i - 1) / 2) / i;
            if (x !=0) break;
        }
        if (i >= 101&&N!=4950)
            System.out.println("No");
        else {
            for (; j < i - 1; j++)
                if (N==4950&&j==i-2)
                {
                    System.out.print(x+j);
                }
                else {
                    System.out.print(x + j + " ");
                }
            if (N!=4950)
                System.out.print(x+i-1);
        }
    }
}