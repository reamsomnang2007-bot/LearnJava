import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id;
        String name;
        char gender;
        int age;
        String department;
        String major;
        System.out.println("----------[ Input Information ]----------");
        System.out.print("Enter ID : ");
        id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Name : ");
        name = scanner.nextLine();

        System.out.print("Enter Gender (M/F) : ");
        gender = scanner.next().charAt(0);

        System.out.print("Enter Age : ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Department : ");
        department = scanner.nextLine();

        System.out.print("Enter Major : ");
        major = scanner.nextLine();

        System.out.println("-----------------------------------------");
        System.out.println("----------[ Output Information ]----------");
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Age : " + age);
        System.out.println("Department : " + department);
        System.out.println("Major : " + major);
        System.out.println("------------------------------------------");



    


        scanner.close();
    }
}
