public class Polymorphism {
    public static void main(String[] args) {
        // Polymorphism = "POLY" = "MANY"
        //                "MORPH" = "SHAPE"
        //                Objects can identify as other objects.
        //                Objects can be treated as objects of a common superclass.

        Car car = new Car("fond", "raptor", 2026, "white", 100000);
        Bike bike = new Bike();
        bike.go();
        Boat boat = new Boat();
        boat.go();

    }
}
