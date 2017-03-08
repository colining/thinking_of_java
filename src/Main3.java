/**
 * Created by asus on 2017/3/8.
 */
/**
 * Created by asus on 2017/3/8.
 */


import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int x = 0;
        double i = L;
        int j = 0;
        for (; i <= 100; i++) {
            if ((N - i * (i - 1) / 2) % i == 0) {             //因为除二所以应该是double
                x = (int) ((N - i * (i - 1) / 2) / i);
                if (x >= 0) break;
            }
        }
        if (i >= 101)
            System.out.println("No");
        else {
            for (; j < i - 1; j++)

                System.out.print(x + j + " ");
                System.out.print( x+(int)i-1);
        }
    }
}