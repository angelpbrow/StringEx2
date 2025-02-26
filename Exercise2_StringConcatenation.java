/*
 * Exercise 2: String Concatenation
 * 
 * Write a program that asks the user for their first and last name separately,
 * then joins them with a space in between and prints the full name.
 */
import java.util.Scanner;

public class Exercise2_StringConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("First name goes here:");
        String firstName = scanner.nextLine();
        
        System.out.print("First name goes here:");
        String lastName = scanner.nextLine();
        System.out.print(firstName +" " + lastName);
        // TODO: Concatenate the first and last name with a space in between
        // using the + operator or concat() method

        scanner.close();
    }
}

// Expected output (if input is "John" and "Smith"):
// Your full name is John Smith.

