import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int maxAttempts = 5;
        int score = 100;

        System.out.println("Guess the Number Game");
        System.out.println("I have selected a number between 1 and 100. Can you guess it?");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Too low. Try again.");
                score -= 20;
            } else {
                System.out.println("Too high. Try again.");
                score -= 20;
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've run out of attempts. The number was: " + randomNumber);
        }

        System.out.println("Your final score is: " + score);
    }
}