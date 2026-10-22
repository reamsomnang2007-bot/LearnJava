import java.util.InputMismatchException;
import java.util.Scanner;
public class exception {
    public static void main(String[] args){
        // exception handing = an even that interrupts the normal flow of a program
        //                     (dividing by zero, file not found, mismatch input type
        //                     surround any dangerous code with a try{} block
        //                     try{}, catch{}, finally{}
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the number : ");
            int num = scanner.nextInt();
            System.out.println(num);
        }
        catch(InputMismatchException s){
            System.out.println("That wasn't a number!");
        }
        catch(ArithmeticException s){
            System.out.println("The number can't divided by zero!");
        }
        catch(Exception e){
            System.out.println("Something went wrong!");
        }
        finally{
            scanner.close();
            System.out.println("This always executes!");
        }
    }
}
