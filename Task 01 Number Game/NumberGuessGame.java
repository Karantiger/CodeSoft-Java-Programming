import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        // 1. Generate random number between 1 and 100
        int randomNumber = (int)(Math.random() * 100) + 1;

        // 2. Take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the number (between 1 and 100): ");
        int userGuess = sc.nextInt();
        System.out.println("The correct number was: " + randomNumber);

        // 3. Compare and give feedback
        if (userGuess == randomNumber) {
            System.out.println("Correct! You guessed the number.");
        } 
        
        else if (userGuess > randomNumber) {
            System.out.println("Too high! Try a smaller number.");
        } 
        
        else {
            System.out.println("Too low! Try a larger number.");
        }

        sc.close();
    }
}
