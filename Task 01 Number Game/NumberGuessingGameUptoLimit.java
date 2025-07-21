import java.util.Scanner;

public class NumberGuessingGameUptoLimit {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalRounds = 0;
        int roundsWon = 0;

        System.out.println(" Welcome to the Number Guessing Game!");

        boolean playAgain = true;

        while (playAgain) {
            totalRounds++;
            int randomNumber = (int)(Math.random() * 100) + 1;
            int attempts = 0;
            int maxAttempts = 5;
            boolean guessedCorrectly = false;

            System.out.println("\n I have selected a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it!");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == randomNumber) {
                    System.out.println(" Correct! You guessed the number in " + attempts + " attempt(s).");
                    guessedCorrectly = true;
                    roundsWon++;
                    break;
                } else if (userGuess > randomNumber) {
                    System.out.println(" Too high!");
                } else {
                    System.out.println(" Too low!");
                }

                System.out.println("Attempts left: " + (maxAttempts - attempts));
            }

            if (!guessedCorrectly) {
                System.out.println(" Out of attempts! The correct number was: " + randomNumber);
            }


            System.out.print("\n Do you want to play another round? (yes/no): ");
            sc.nextLine(); 
            String response = sc.nextLine().trim().toLowerCase();
            if (!response.equals("yes") && !response.equals("y")) {
                playAgain = false;
            }
        }


        System.out.println("\n Game Over!");
        System.out.println(" Total Rounds Played: " + totalRounds);
        System.out.println(" Rounds Won: " + roundsWon);
        System.out.println(" Rounds Lost: " + (totalRounds - roundsWon));

        sc.close();
    }
}
