public class MethodOverriding {
    public static void main(String[] args) {
        // Method overriding = when a subclass provides its own 
        //                     implementation of a method that is already defind.
        //                     allows for code reusability and give specific implementations
        Dog dog = new Dog();
        Cat cat = new Cat();
        Rabbit rabbit = new Rabbit();
        dog.walk();
        cat.walk();
        rabbit.walk();
    }
}
