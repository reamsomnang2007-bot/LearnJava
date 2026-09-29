import java.util.Scanner;
public class swith {
    public static void main(String[] args) {
        // enhanced switch = a replacement to many else if statement
        try(Scanner scanner = new Scanner(System.in)){
        System.out.print("Enter the day of the week : ");
        String day = scanner.nextLine();

        switch(day){
            case "Monday", "Tuseday", "Wednesday", "Thursday" , "Friday" -> System.out.println("It is a weekday");
            case "Saturday", "Sunday" -> System.out.println("It is a weekened");
            default -> System.out.println(day + " is not a day!");
        }
        // switch(day){
        //     case "Monday" -> System.out.println("It is a weekday");
        //     case "Tuseday" -> System.out.println("It is a weekday");
        //     case "Wednesday" -> System.out.println("It is a weekday");
        //     case "Thursday" -> System.out.println("It is a weekday");
        //     case "Friday" -> System.out.println("It is a weekday");
        //     case "Saturday" -> System.out.println("It is a weekened");
        //     case "Sunday" -> System.out.println("It is a weekened");
        //     default -> System.out.println(day + " is not a day!");
        // }

        scanner.close();
    }
    }
}
