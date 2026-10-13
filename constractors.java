public class constractors {
    public static void main(String[] args){
    // constructors = a special method to intialize objects 
    //                you can pass arguments to a constructor
    //                and set up intial values
    Student student1 = new Student("Ream Somnang", 19, 3.6);
    Student student2 = new Student("Ream Kosin", 15, 3.5);

    System.out.println(student1.name);
    System.out.println(student1.age);
    System.out.println(student1.gpa);
    System.out.println(student1.isEnrolled);

    System.out.println(student2.name);
    System.out.println(student2.age);
    System.out.println(student2.gpa);
    System.out.println(student2.isEnrolled);

    student1.study();
    student2.study();
    

    }

}
