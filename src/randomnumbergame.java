
import java.util.Random;
import java.util.Scanner;

public class randomnumbergame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1; // Generate random number between 1 and 100
            int attempts = 0;

            System.out.println("\nI've picked a number between 1 and 100. Try to guess it!");

            while (attempts < 10) { // Limit to 10 attempts
                System.out.print("Your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("You got it in " + attempts + " attempts! Your score: " + (++score));
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low.");
                } else {
                    System.out.println("Too high.");
                }
            }

            if (attempts == 10) {
                System.out.println("Sorry, you've used all your attempts. The number was " + numberToGuess);
            }

            System.out.print("Play again? (yes/no): ");
            String answer = scanner.next().toLowerCase();
            playAgain = answer.equals("yes");
        }

        System.out.println("\nThanks for playing! Your final score: " + score);
        scanner.close();
    }
}
