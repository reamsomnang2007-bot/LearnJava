public class Students extends Person{
    double gpa;
    Students(String firstname, String lastname, double gpa){
        super(firstname, lastname);
        this.gpa = gpa;
    }

    void showGPA(){
        System.out.println(this.lastname + "'s gpa is " + this.gpa);
    }
}
