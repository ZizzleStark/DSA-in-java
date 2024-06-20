import java.util.Scanner;

public class isSorted {
    public static void main(String[] args) {
        String name ="sarthak";
        Scanner in =new Scanner(System.in);
        System.out.println("no. of elements in array");
        int len=in.nextInt();
        int[] num=new int[len];
        System.out.println("enter the numbers");
        for(int i=0;i<num.length;i++){
            num[i]=in.nextInt();
        }

        boolean isAscending=true;
        for(int i=0;i<num.length-1;i++){
            if (num[i] > num[i + 1]) {
                isAscending = false;
                break;
            }
        }

        if(isAscending)
            System.out.println("Ascending order");
        else
            System.out.println("not Ascending order");

    }

    greet(name)
}
