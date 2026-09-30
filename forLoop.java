import java.util.Scanner;
public class forLoop {
    public static void main(String[] args) throws InterruptedException{
        // for loop = excute some code a certain(ប្រាកដ) amount of times

        // for(int i = 1; i <= 10; i++){
        //     System.out.print(i + " ");
        // }

        // try(Scanner scanner = new Scanner(System.in)){
        //     System.out.print("Enter how many times you want to loop : ");
        //     int max = scanner.nextInt();
        //     for(int i = 1; i <= max; i++){
        //         System.out.println(i);
        //     }
        // }
        try(Scanner scanner = new Scanner(System.in)){
        System.out.print("How many seconds to countdown from : ");
        int start = scanner.nextInt();
        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy New Year!");

        scanner.close();
    }
    }
}
