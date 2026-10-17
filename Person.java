public class Person {
    String firstname;
    String lastname;

    Person(String first, String last) {
        this.firstname = first;
        this.lastname = last;

    }

    void showName(){
        System.out.println(this.firstname + " " + this.lastname);
    }

    
}
