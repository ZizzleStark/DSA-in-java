import java.util.Scanner; // Importing the Scanner class from java.util package for user input

public class Butterfly { // Declaring a class named Butterfly
    public static void main(String[] args) { // Main method declaration
        Scanner in = new Scanner(System.in); // Creating a Scanner object named 'in' for user input
        System.out.println("Enter the number of rows you want in the butterfly pattern:"); // Printing a message to prompt user input
        int rows = in.nextInt(); // Reading the number of rows entered by the user and storing it in the variable 'rows'


            double n = rows / 2; // Calculating the midpoint of the rows

            // Loop for printing upper half of the butterfly pattern
            for (double i = 1; i <= n; i++) { // Loop for iterating through each row in the upper half
                for (int j = 1; j <= i; j++) // Loop for printing stars in the left half of the row
                    System.out.print("* "); // Printing a star followed by a space
                for (int j = 1; j <= (2 * (n - i)); j++) // Loop for printing spaces in the middle of the row
                    System.out.print("  "); // Printing two spaces
                for (int j = 1; j <= i; j++) // Loop for printing stars in the right half of the row
                    System.out.print("* "); // Printing a star followed by a space
                System.out.println(); // Moving to the next line after printing each row
            }

            // Loop for printing lower half of the butterfly pattern
            for (double i = n; i >= 1; i--) { // Loop for iterating through each row in the lower half
                for (int j = 1; j <= i; j++) // Loop for printing stars in the left half of the row
                    System.out.print("* "); // Printing a star followed by a space
                for (int j = 1; j <= (2 * (n - i)); j++) // Loop for printing spaces in the middle of the row
                    System.out.print("  "); // Printing two spaces
                for (int j = 1; j <= i; j++) // Loop for printing stars in the right half of the row
                    System.out.print("* "); // Printing a star followed by a space
                System.out.println(); // Moving to the next line after printing each row

        }
    }
}
