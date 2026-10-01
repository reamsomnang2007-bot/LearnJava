import java.util.Scanner;
public class bankingProgram {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
            double balance = 0;
            boolean isRunning = true;
            int choice;
            while(isRunning){
                menu();
                System.out.print("Enter your choice : ");
                choice = scanner.nextInt();
                switch(choice){
                    case 1 ->{
                        System.out.println("-----[ Show Balance ]-----");
                        showBalance(balance);
                        System.out.println("--------------------------");
                    }
                    case 2 ->{
                        System.out.println("-----[ Deposit ]-----");
                        balance += deposite();
                        System.out.println("Deposite successful!");
                        System.out.println("---------------------");
                    }
                    case 3 ->{
                        System.out.println("-----[ Withdraw ]-----");
                        balance -= withdraw(balance);
                        System.out.println("Withdraw money successful!");
                        System.out.println("----------------------");
                    }
                    case 4 ->{
                        System.out.println("Thank you for your visiting...!");
                        isRunning = false;
                    }
                    default ->{
                        System.out.println("Please enter only 1 - 4!");
                    }
                }
            }
        }

    static void menu(){
        System.out.println("------[ Banking Program ]-----");
        System.out.println("[1]. Show Balance ");
        System.out.println("[2]. Deposit ");
        System.out.println("[3]. Withdraw");
        System.out.println("[4]. Exit");
        System.out.println("------------------------------");
    }
    static void showBalance(double balance){
        System.out.printf("Your balance is $%.2f\n", balance);
    }
    static double deposite(){
        double amount;
        System.out.print("Enter Amount to be deposite : ");
        amount = scanner.nextDouble();
        if(amount < 0){
            System.out.println("Amount can't be negative!");
            return 0;
        }
        else{
            return amount;
        }
    }
    static double withdraw(double balance){
        double amount;
        System.out.print("Enter Amount to be withdraw : ");
        amount = scanner.nextDouble();
        if(amount > balance){
            System.out.println("Amount is greater than balance!");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount can't be negative!");  
            return 0;  
        }
        else{
            return amount;
        }
    }
}
