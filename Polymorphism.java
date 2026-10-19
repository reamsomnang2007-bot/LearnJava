public class Polymorphism {
    public static void main(String[] args) {
        // Polymorphism = "POLY" = "MANY"
        //                "MORPH" = "SHAPE"
        //                Objects can identify as other objects.
        //                Objects can be treated as objects of a common superclass.

        Car car = new Car(null, null, 0, null);
        car.go();
        Bike bike = new Bike();
        bike.go();
        Boat boat = new Boat();
        boat.go();

        Vehicle[] vehicles = {car, bike, boat};
        for(Vehicle v : vehicles){
            v.go();
        }



    }
}
