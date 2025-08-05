import java.util.Scanner;
import java.util.Random;

public class Project1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        boolean play = true;

        System.out.println("Welcome to the Number Guessing Game!");

        while (play) {
            int guessNumber = random.nextInt(100) + 1;
            int guess = 0;

            System.out.println("\nI have picked a number between 1 and 100. Try to guess it!");

            while (guess != guessNumber) {
                System.out.print("Enter your guess: ");

                while (!scan.hasNextInt()) {
                    System.out.print(" Try again: ");
                    scan.next();
                }

                guess = scan.nextInt();

                if (guess < guessNumber) {
                    System.out.println("Too low!");
                } else if (guess > guessNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Correct! You guessed the number.");
                }
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            String res = scan.next().toLowerCase();
            play = res.equals("yes");
        }

        System.out.println("Thanks for playing!");
        scan.close();
    }
}