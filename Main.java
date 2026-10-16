public class Main{
    public static void main(String[] args) {
        Student[] students = new Student[1];
        for(int i = 0; i < students.length; i++){
            students[i] = new Student();
            students[i].addStudent();
        }
        System.out.println("----------[ Display All Student ]----------");
        for(int i = 0; i < students.length; i++){
            students[i].displayAllStudent();
        }
        System.out.println("-------------------------------------------");
    }
}