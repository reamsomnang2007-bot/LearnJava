import java.util.Scanner;
public class arrays {
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
        String[] foods;
        int size;
        System.out.print("Enter the # of food : ");
        size = scanner.nextInt();
        scanner.nextLine();
        foods = new String[size];
        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a food : ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods){
            System.out.println(food);
        }
    }
    }
}
