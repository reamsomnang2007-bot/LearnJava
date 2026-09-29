import java.util.Scanner;
public class ifStatement {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
        String name;
        int age;
        System.out.print("Enter your name : ");
        name = scanner.nextLine();
        System.out.print("Enter your age : ");
        age = scanner.nextInt();

        if(name.isEmpty()){
            System.out.println("You didn't enter your name!");
        }
        else{
            System.out.println("Hello " + name);
        }
        if(age >= 65){
            System.out.println("You are a senior!");
        }
        else if(age >= 18){
            System.out.println("You are a adult!");
        }
        else if(age == 0){
            System.out.println("You are a baby!");
        }
        else if(age < 0 ){
            System.out.println("You haven't been born yet!");
        }
        else{
            System.out.println("You are a child!");
        }

    }
    }
}
