import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String userinfo = in.nextLine();
        if (isPalindrome(userinfo)) {
            System.out.println("is a palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
    public static boolean isPalindrome(String s  )
        {
            int left=0,right=s.length()-1;
            while(left<right)
            {
                while(left<right && !Character.isLetterOrDigit(s.charAt(left))) {
                    left++;
                }

                while(left<right && !Character.isLetterOrDigit(s.charAt(right))) {
                    right--;
                }

        if (left < right && Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
            return false;
        }
            }


            return true;


        }
}
