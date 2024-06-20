import java.util.Scanner;

public class temprature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("program to convert celcius in farenhit");
        System.out.println("enter temp in cel");
        float cel=in.nextFloat();
        double far= (cel*9/5)+32;
        System.out.println("temp in farenhiet is"+far);

    }
}
