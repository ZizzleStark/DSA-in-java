import java.util.Scanner;

public class FibonnaciSeries2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of elements of series");

        try {
            int n = in.nextInt();

            if (n < 0) {
                throw new Exception("Negative numbers are not allowed");
            }

            System.out.println("the fibonnaci series upto " + n + "terms is");
            for (int i = 0; i <= n; i++) {
                System.out.println( Fibonnaci(i));
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());

        }
        finally{
            in.close();
        }


    }

    public static int Fibonnaci(  int n)

    {
        int a=0,b=1,c;
      if(n==0)
      {
          return 0;
      }
      else if (n==1)
      {
          return 1;
      }
      else if (n>=2)
      {

          for(int i=2;i<n;i++){
              c=a+b;
              a=b;
              b=c;

          }


      }
        return b;

    }

}
