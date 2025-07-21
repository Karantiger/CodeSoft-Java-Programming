import java.util.Scanner;

public class GuessTheRandomGeneratedNumber {
    public static void main(String[] args) {
        // 1. Generate random number between 1 and 100
        int randomNumber = (int)(Math.random() * 100) + 1;

        // 2. Take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the number (between 1 and 100): ");
        int userGuess = sc.nextInt();

        // 3. Show the generated number and user's guess
        System.out.println("Generated number: " + randomNumber);
        System.out.println("Your guess: " + userGuess);

        // 4. Compare guess with the random number
        if (userGuess == randomNumber) {
            System.out.println("Correct! You guessed the number.");
        } 
        
        else {
            System.out.println("Wrong guess. Better luck next time!");
        }

        sc.close();
    }
}
