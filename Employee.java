public class Employee extends Person{
    int salary;

    Employee(String firstname, String lastname, int salary) {
        super(firstname, lastname);
        this.salary = salary;
    }
    void showSalary(){
        System.out.println(this.lastname + "'s salary is $" + this.salary);
    }
    
    
}
