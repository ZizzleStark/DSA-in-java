import java.util.*;
public class Solution {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.println("enter n");
        int series_number=in.nextInt();
        System.out.println("the nth term is"+Fibonnaci(series_number));



    }


    public static int Fibonnaci(int n){

        return switch (n) {
            case 1 -> 1;
            case 2 -> 1;
            default -> Fibonnaci(n - 1) + Fibonnaci(n - 2);
        };


    }

}
