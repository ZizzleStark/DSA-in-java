import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = in.nextInt();
        int counter = 0;

        while (num != 0) {
            num = num / 10;
            counter++;
        }

        System.out.println("Number of digits: " + counter);
    }
}
