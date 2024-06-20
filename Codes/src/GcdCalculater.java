import java.util.*;

import static java.lang.Math.max;

public class GcdCalculater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the 2 numbers u want gcd of ");
        int number1 =in.nextInt();
        int number2 =in.nextInt();
        System.out.println("the gcd is "+GCD(number1,number2));
    }

    public static int GCD(int num1,int num2){
        int gcd=1;
        for(int i=1;i<Math.min(num1,num2);i++){
            if(num1%i==0 && num2%i ==0)
                gcd=i;

        }
        return gcd;

    }
}
