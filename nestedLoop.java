import java.util.Scanner;
public class nestedLoop {
    public static void main(String[] args) {
        // nested loop = a loop inside another loop used often with matrices or DS@A
        // for (int i = 1; i <= 10; i++) {
        //     for(int j = 1; j <= 10; j++){
        //         System.out.print("$ ");
        //     }
        //     System.out.println();
        // }
        try(Scanner scanner = new Scanner(System.in)){
            int rows;
            int colums;
            char symbol;

            System.out.print("Enter the # of rows : ");
            rows = scanner.nextInt();

            System.out.print("Enter the # of colums : ");
            colums = scanner.nextInt();

            System.out.print("Enter the symbol to use : ");
            symbol = scanner.next().charAt(0);

            for(int i = 0; i < rows; i++){
                for(int j = 0; j < colums; j++){
                    System.out.printf("%c ", symbol);
                }
                System.out.println();
            }
        }
    }
}
