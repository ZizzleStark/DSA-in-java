import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the length of the array");
        int len=in.nextInt();
        int[] numbers = new int[len];
        System.out.println("enter the numbers");
        for(int i=0;i<numbers.length;i++){
            numbers[i]=in.nextInt();
        }
        int min=numbers[0];
        int max=numbers[0];

        for(int i=0;i<numbers.length;i++){

            if(numbers[i]<min)
                min=numbers[i];
            else if(numbers[i]>max)
                max=numbers[i];

        }
        System.out.println(" max is "+max);
        System.out.println(" min is "+min);

    }
}
