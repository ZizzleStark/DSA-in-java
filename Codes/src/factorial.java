import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of which u want factorial");
        int num=in.nextInt();
        System.out.println(Factorial(num));
    }
    public static String Factorial(int n){
        if (n==0)
            return "0!=1";

        int result=1;
        StringBuilder sequence=new StringBuilder();

        for(int i=n;i>0;i++){
            result*=i;
            sequence.append(i);
            if(i>1){
                sequence.append("*");
            }
        }
        sequence.append("=");
        sequence.append(result);
        return sequence.toString();

        
    }
}
