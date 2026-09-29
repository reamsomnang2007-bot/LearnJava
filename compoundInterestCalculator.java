import java.util.Scanner;
public class compoundInterestCalculator {
    public static void main(String[] args) {
        // compound interest calculator

        try(Scanner scanner = new Scanner(System.in)){

        double principal;
        double rate;
        int timesCompounded;
        int year;
        double amount;

        System.out.print("Enter the principle amount : ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %) : ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # times compounded per year : ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the # of years : ");
        year = scanner.nextInt();

        amount = principal * Math.pow((1 + rate / timesCompounded), timesCompounded * year);
        
        System.out.printf("The amount after %d  years is : $ %.2f", year, amount);

        scanner.close();

        }

    }
}
