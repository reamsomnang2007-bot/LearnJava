import java.util.Scanner;
public class searchAnArray {
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){

            // int[] numbers = {3, 5, 1, 9, 2, 0, 6, 4, 7};
            // int searchNumber;
            // System.out.print("Enter # to search index : ");
            // searchNumber = scanner.nextInt();
            // for(int i = 0; i < numbers.length; i++){
            //     if(searchNumber == numbers[i]){
            //         System.out.println("Element found at index : " + i);
            //         break;
            //     }
            //     else{
            //         System.out.println("The element not found!");
            //         break;
            //     }
            // }

            String[] students = {"Ream Somnang", "Ream Kosin", "Ream Chansola", "Ream Ra", "Hour Nareth"};
            String searchStudent;
            boolean isFound = false;
            System.out.print("Enrter student name to search index : ");
            searchStudent = scanner.nextLine();
            for(int i = 0; i < students.length; i++){
                if(students[i].equals(searchStudent)                                                                                                        ){
                    System.out.printf("Student name : %s found at index : %d\n", searchStudent, i);
                    isFound = true;
                    break;
                }
            }
            if(!isFound){
                System.out.println("The student name not found!");
            }
        }
    }
}
