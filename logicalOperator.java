import java.util.Scanner;
public class logicalOperator {
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
        String username;
        // && = and
        // || = or
        // ! = not
        // double temp = 36;
        // boolean isSunny = false;
        // if(temp <= 30 && temp >= 0 && isSunny){
        //     System.out.println("The weather is good !");
        //     System.out.println("It is Sunny outside !");
        // }
        // else if (temp <= 30 && temp >= 0 && !isSunny){
        //     System.out.println("The weather is good !");
        //     System.out.println("It is cloudy outside !");
        // }
        // else if(temp > 30 || temp < 0){
        //     System.out.println("The weather is bad !");
        // }

        System.out.print("Enter your new username : ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4 - 12 characters!");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain space or underscores!");
        }
        else{
            System.out.println("Welcome," + username);
        }

        scanner.close();
    }
    }
}
