// Java String Exercises for Beginners
// Each exercise includes instructions, starter code, and expected output

/*
 * Exercise 1: String Length
 * 
 * Write a program that asks the user to enter their name and 
 * prints out how many characters are in their name.
 */
import java.util.Scanner;

public class Exercise1_StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Place your name here:");
        String name = scanner.nextLine();
        System.out.print(name.length());
        // TODO: Print the length of the name using the length() method

        scanner.close();
    }
}

// Expected output (if input is "Maria"):
// Your name has 5 characters.

