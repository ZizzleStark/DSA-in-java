import java.util.Arrays;
import java.util.Scanner;

public class SwapIndexes {
    
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] arr= {1,2,3,4,5,6,7,8,9,10,11};
        System.out.println(Arrays.toString(arr));
//        System.out.println("enter lower bound and upper bound");
//        int lbound=in.nextInt();
//        int upbound=in.nextInt();
//        System.out.println(max(arr,lbound,upbound));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] array,int index1,int index2){
        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
    
//    static int max(int[] array,int index1,int index2){
//        if(index2>index1)
//            return -1;
//        if(array.length==0)
//            return -1;
//        int max = array[index1];
//        for (int i = index1; i <=index2; i++) {
//            max = array[0];
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//        return max;
//    }
    public static   void reverse(int[] array){
        int start=0;
        int end= array.length-1;
        while (start<end){
            swap(array,start,end);
            start++;
            end--;
        }
    }


        
}
