/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Random;
import java.util.Scanner;

/**
 * NumberGuessingGame is a simple Java program that allows the user to guess a randomly generated number.
 * The user receives feedback on whether their guess is too high, too low, or correct.
 * The program also keeps track of the number of attempts and displays the count when the user guesses correctly.
 */
public class NumberGuessingGame {

    /**
     * The main method where the execution of the program begins.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Initialize Scanner for user input and Random for generating a random number
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Set the range for the random number
        int lowerBound = 1;
        int upperBound = 100;

        // Generate a random number within the specified range
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        // Display welcome message and instructions
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between " + lowerBound + " and " + upperBound + ". Try to guess it.");

        // Variables to store user guess and number of attempts
        int userGuess;
        int attempts = 0;

        // Main game loop
        do {
            // Prompt the user to enter their guess
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            // Provide feedback based on the user's guess
            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                // Congratulate the user for guessing the correct number and display the number of attempts
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }

        } while (userGuess != randomNumber); // Continue the loop until the user guesses the correct number

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}

