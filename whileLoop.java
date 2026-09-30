import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            int number = 0;
            // int age = 0;
            // System.out.print("Enter your age : ");
            // age = scanner.nextInt();

            // while(age < 0){
            //     System.out.println("Your age can't be negative!");
            //     System.out.print("Enter your age : ");
            //     age = scanner.nextInt();
            // }
            // System.out.println("You are " + age + " years old!");

            do{
                System.out.print("Enter a number between 1 - 10 : ");
                number = scanner.nextInt();
            }while(number < 1 || number > 100);
            System.out.println("You picked " + number);
        }
    }
}
