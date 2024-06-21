import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the number or elemtns in array");
        int n=in.nextInt();
        System.out.println("enter the  elements of the array");
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println(largest(arr,n));
    }



            public static int largest(int arr[], int n)
            {
                if(n==0)
                    return -1;
                if(n==1)
                    return arr[0];
                if(n>=1 && n<=1000 ){
                    int max=0;
                    for(int i=0;i<n;i++){
                        if(arr[i]>=0 && arr[i]<=1000){
                            max=arr[0];
                            if(arr[i]>max)
                                max=arr[i];
                        }
                        return max;

                        else
                            return -1;
                    }

                }
                else return -1;
            }

    }

