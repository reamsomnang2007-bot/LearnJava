import java.util.Scanner;
public class subString {
    public static void main(String[] args) {
        // .substring() = A method used to extract a portion of string
        // .substring(start, end)

        try(Scanner scanner = new Scanner(System.in)){
        String userName;
        String username;
        String email;
        String domain;

        System.out.print("Enter username : ");
        userName = scanner.nextLine();

        System.out.print("Enter the Email : ");
        email = scanner.nextLine();

        if(userName.isEmpty()){
            System.out.println("The username cannot empty!");
        }
        else{
            if(email.contains("@")){
                username = email.substring(0, email.indexOf("@"));
                domain = email.substring(email.indexOf("@") + 1);
                System.out.printf("Welcome , %s\n", userName);
                System.out.println(username);
                System.out.println(domain);

            }
            else{
                System.out.println("Emails must contain @!");
            }
        }

        scanner.close();

    }
    }
}
