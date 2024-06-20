import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter the number to be checked");
        int number = in.nextInt();
        char charFromNumber = (char) number;

        // Check if the char is a digit

            if (isArmstrong(number)) {
                System.out.println("is Armstrong number");
            } else {
                System.out.println("is not an Armstrong number");

        }
    }


    public static boolean isArmstrong(int n)
    {
            int numDigits=String.valueOf(n).length();
            int sum=0;
            int temp=n;

            while(temp>0)
            {
                int digit=temp %10;
                sum += (int) Math.pow(digit,numDigits);
                temp /=10;

            }
            return sum==n;



    }

}
