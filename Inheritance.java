public class Inheritance {
    public static void main(String[] args){
        // Inheritance = one class inherits the attributes and methods 
        //              from another class.
        //              child <- parent <- grandparent
        Dog dog = new Dog();
        Rabbit rabbit = new Rabbit();
        rabbit.walk();
        System.out.println(dog.isLive);

    }
}
