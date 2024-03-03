
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attempts = 5;
        int score = 0;

        boolean playAgain = true;
        while (playAgain) {
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("Guess the number between " + minRange + " and " + maxRange + ".");
            System.out.println("You have " + attempts + " attempts.");

            int guess;
            boolean guessedCorrectly = false;
            for (int i = 1; i <= attempts; i++) {
                System.out.print("Attempt " + i + ": Enter your guess: ");
                guess = scanner.nextInt();

                if (guess == randomNumber) {
                    System.out.println("Congratulations! You've guessed the correct number.");
                    guessedCorrectly = true;
                    score += attempts - i + 1;
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + randomNumber);
            }

            System.out.println("Your score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = scanner.next().toLowerCase();
            playAgain = playChoice.equals("yes");
        }
        System.out.println("Thank you for playing the Number Guessing Game!");
    }
}


