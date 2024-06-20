import java.util.Scanner;

public class switchfirst {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter button");
        int button=in.nextInt();

        switch(button){

            case 1: {
                System.out.println("hello,this is button 1");
                break;
            }
            case 2:{
                System.out.println("namaste");

            }
            case 3:{
                System.out.println("bonjour");
            }
            default:
                System.out.println("invalid button");
        }
    }
}
