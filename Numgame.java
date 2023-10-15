import java.util.Random;
import java.util.Scanner;

public class Numgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("WELCOME TO THE NUMBER GUESSING GAME!!!!");

        String playAgain = "yes";
        int totalAttempts = 0;
        int totalRounds = 0;

        while (playAgain.equalsIgnoreCase("yes")) {
            totalRounds++;
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            boolean guessedCorrectly = false;

            int maxAttempts = 10;

            System.out.println("Round " + totalRounds + ":");
            while (attempts < maxAttempts) {
                try {
                    System.out.print("Attempt " + (attempts + 1) + ": ENTER YOUR GUESS (1-100): ");
                    int userGuess = scanner.nextInt();
                    attempts++;

                    if (userGuess < numberToGuess) {
                        System.out.println("TOO LOW!! Try a higher number.");
                    } else if (userGuess > numberToGuess) {
                        System.out.println("TOO HIGH!! Try a lower number.");
                    } else {
                        guessedCorrectly = true;
                        System.out
                                .println("CONGRATULATIONS!!!!  You guessed the correct no. (" + numberToGuess + ") in "
                                        + attempts + " attempts.");
                        break;
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("INVALID INPUT!!  Please enter a valid no.");
                    scanner.next();
                }
            }

            if (!guessedCorrectly) {
                System.out.println("SORRY, you have reached the maximum no. of attempts. The correct no. was "
                        + numberToGuess + ".");
            }

            totalAttempts += attempts;

            System.out.print("DO YOU WANNA PLAY AGAIN?? (YES/NO): ");
            playAgain = scanner.next();
        }

        double averageAttemptsPerRound = totalRounds > 0 ? (double) totalAttempts / totalRounds : 0;
        System.out
                .println("GAME OVER!!!! You played " + totalRounds + " rounds and your average attempts per round was "
                        + String.format("%.2f", averageAttemptsPerRound) + ".");

        scanner.close();
    }
}
