import java.util.Scanner;

public class ArrayOfNames{
    public static void main(String[] args) {
        Scanner in =new Scanner((System.in));
        System.out.println("enter the number of names to accept in array");
        int num=in.nextInt();
        String Names[]=new String[num];
        System.out.println("enter names");
        for(int i=0;i<Names.length;i++){
            Names[i]=in.next();

        }
        System.out.println("Names are");
        for(int i=0;i<Names.length;i++){
            System.out.println(Names[i]);
        }

    }
}