import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Step 1: Generate a random number between 1 and 100
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;

        // Initialize the number of attempts
        int attempts = 0;

        // Initialize the score
        int score = 0;

        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Game loop
        while (true) {
            // Step 2: Prompt the user to enter their guess
            System.out.println("Enter your guess (1-100):");
            int userGuess = scanner.nextInt();

            // Increment the number of attempts
            attempts++;

            // Check if the user's guess is correct
            if (userGuess == numberToGuess) {
                // Calculate the score based on the number of attempts
                score = 100 - (attempts - 1) * 5;

                // Display the result
                System.out.println("Congratulations! You found the number in " + attempts + " attempts.");
                System.out.println("Your score is " + score);

                // Break out of the loop
                break;
            } else if (userGuess < numberToGuess) {
                // Display a hint if the user's guess is too low
                System.out.println("Too low! Try again.");
            } else {
                // Display a hint if the user's guess is too high
                System.out.println("Too high! Try again.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
