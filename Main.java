import java.util.Random;
import java.util.Scanner;
public class Main{
    static Random random = new Random();
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
        int balance = 100;
        int payout;
        int bet;
        String[] row;
        String playAgain;
        System.out.println("---------------------------------");
        System.out.println("Welcome to java slot machine game");
        System.out.println("Symbols : 🍒 🍉 🍋 🔔 ⭐");
        System.out.println("---------------------------------");
        while(balance > 0){
            System.out.println("Current balance : $" + balance);
            System.out.print("Place your bet amount : ");
            bet = scanner.nextInt();
            if(bet > balance){
                System.out.println("Insufficient funds!");
                continue;
            }
            else if(bet <= 0){
                System.out.println("Bet must be greater than 0!");
            }
            else{
                balance -= bet;
            }
            System.out.println("Spining...");
            row = spinRow();
            printRow(row);

            payout = getPayout(row, bet);
            if(payout > 0){
                System.out.println("You won $" + payout);
                balance += payout;
            }
            else{
                System.out.println("Sorry you lost this round!");
            }
            
            


        }
    }
    }
    static String[] spinRow(){
        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String[] row = new String[3];
        for(int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        } 
        return row;
    }
    static void printRow(String[] row){
        System.out.println("------------------------------");
        System.out.println("" + String.join(" | ", row));
        System.out.println("------------------------------");
    }
    static int getPayout(String[] row, int bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "🍒" -> bet * 10;
                case "🍉" -> bet * 5;
                case "🍋" -> bet * 3;
                case "🔔" -> bet * 2;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        }
        else if(row[0].equals(row[1]) || row[1].equals(row[2])){
            return switch(row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 1;
                case "🍋" -> bet * 1;
                case "🔔" -> bet * 1;
                case "⭐" -> bet * 5;
                default -> 0;
            };
        }
        else{
            return 0;
        }
    }
}