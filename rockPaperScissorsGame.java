import java.util.Scanner;
import java.util.Random;
public class rockPaperScissorsGame {
    public static void main(String[] args){
        // rock paper scissors game
        try(Scanner scanner = new Scanner(System.in)){
            Random random = new Random();

            String[] choices = {"rock", "paper", "scissors"};
            String playerChoice;
            String computerChoice;
            String playAgain = "yes";
            do{
            System.out.print("Enter your choice (rock, paper, scissors) : ");
            playerChoice = scanner.nextLine().toLowerCase();
            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
                System.out.println("Invalid choice!. Please enter only(rock, paper, scissors)!");
                continue;
            }
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice : " + computerChoice);

            if((playerChoice.equals("rock") && computerChoice.equals("scissors")) || (playerChoice.equals("paper") && computerChoice.equals("rock")) || (playerChoice.equals("scissors") && computerChoice.equals("paper"))){
                System.out.println("You win!");
            }
            else if(playerChoice.equals(computerChoice)){
                System.out.println("It's tie!");
            }
            else{
                System.out.println("You lose!");
            }
            System.out.print("Player again ? (yes/no) : ");
            playAgain = scanner.nextLine().toLowerCase();

            }while(playAgain.equals("yes"));
            System.out.println("Thank you for your visiting!. Good bye!");
        }
    }
}
