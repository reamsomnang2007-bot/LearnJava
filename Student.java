import java.util.ArrayList;
import java.util.Scanner;
public class Student {
    String name;
    int id;
    char gender;
    int age;
    String course;
    String classroom;
    String contact;
    static Scanner scanner = new Scanner(System.in);
    Student(String name, int id, char gender, int age, String course, String classroom, String contact){
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.age = age;
        this.course = course;
        this.classroom = classroom;
        this.contact = contact;
    }
    public void addStudent(){
        System.out.println("----------[ Add Student ]----------");
        System.out.print("Name : ");
        this.name = scanner.nextLine();
        System.out.print("ID : ");
        this.id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Gender : ");
        this.gender = scanner.next().charAt(0);
        System.out.print("Age : ");
        this.age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Course : ");
        this.course = scanner.nextLine();
        System.out.print("Classroom : ");
        this.classroom = scanner.nextLine();
        System.out.print("Contact : ");
        this.contact = scanner.nextLine();
        System.out.println("-----------------------------------");
    }
    public void displayAllStudent(){
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Gender : " + gender);
        System.out.println("Age : " + age);
        System.out.println("Course : " + course);
        System.out.println("Classroom : " + classroom);
        System.out.println("Contact : " + contact);
    }
   

    
}
