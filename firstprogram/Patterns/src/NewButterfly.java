import java.util.Scanner; // Importing Scanner class for user input

public class NewButterfly { // Declaring the main class
    public static void main(String[] args) { // Main method declaration
        Scanner scanner = new Scanner(System.in); // Creating Scanner object to read input from console
        System.out.println("Enter the number of rows for the butterfly pattern:"); // Prompting user for input
        int N = scanner.nextInt(); // Reading the number of rows and storing in variable N

        int spaces = 2 * N - 1;  // Initializing number of spaces between star patterns
        int stars = 0; // Initializing number of stars on each side

        for (int i = 1; i <= 2 * N - 1; i++) { // Loop to iterate through each row
            if (i <= N) { // Condition to handle the upper half of the butterfly
                spaces -= 2; // Decrease spaces by 2 in each row of the upper half
                stars++; // Increase the number of stars by 1 in each row of the upper half
            } else { // Condition to handle the lower half of the butterfly
                spaces += 2; // Increase spaces by 2 in each row of the lower half
                stars--; // Decrease the number of stars by 1 in each row of the lower half
            }

            // Print stars for the left half
            for (int j = 1; j <= stars; j++) {
                System.out.print("*"); // Printing stars for the left half
            }

            // Print spaces in the middle
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" "); // Printing spaces in the middle
            }

            // Print stars for the right half
            for (int j = 1; j <= stars; j++) {
                if (j != N) { // Avoid printing the middle star on the last row of upper half
                    System.out.print("*"); // Printing stars for the right half
                }
            }

            // Move to the next line after printing each row
            System.out.println(); // New line after each row
        }
    }
}
