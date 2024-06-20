//fibonacci series

import java.util.*;
public class FibonnaciSeries1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter numbers of elements u want of fibonnaci series");
        int n = in.nextInt();
        if (n < 0) {
            System.out.println("number of terms must be positive");
        } else {
            System.out.println("fibonacci terms upto" + n + "terms are");
            for (int i = 0; i <= n;i++)
            {
                System.out.println(fibonacci(i) + "  ");
            }
        }

        in.close();
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n - 2);
        }


    }
}
