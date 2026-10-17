public class Super {
    public static void main(String[] args) {
        // super = refers to the parent class (subclass <- superclass)
        //         used in constructors and method overriding
        //         calls the parent constructor to initialize attributes

        Person person = new Person("Ream", "Somnang");
        Students students = new Students("Ream", "Kosin", 3.6);
        Employee employee = new Employee("Ream", "Somnang", 800);
        person.showName();
        students.showName();
        students.showGPA();
        employee.showSalary();


    }
}
