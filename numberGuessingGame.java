import java.util.Random;
import java.util.Scanner;
public class numberGuessingGame {
    public static void main(String[] args){
        // number guessing game
        Random random = new Random();
        try(Scanner scanner = new Scanner(System.in)){
        int guess;
        int min = 1;
        int max = 100;
        int attempts = 0;
        int randomNumber = random.nextInt(min, max + 1);
        
        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d - %d\n", min, max);
        do { 
            System.out.print("Enter a guess : ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("Too low Try again!");
                System.out.printf("Guess a number between %d - %d\n", min, max);
            }
            else if(guess > randomNumber){
                System.out.println("Too high Try again!");
                System.out.printf("Guess a number between %d - %d\n", min, max);
            }
            else{
                System.out.println("Correct ! the answer was " + randomNumber);
                System.out.println("# of attempts is " + attempts);
            }
            
        } while (guess != randomNumber);
        System.out.println("You have won");

        scanner.close();
    }
    }
}
