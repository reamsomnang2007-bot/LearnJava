public class toStringMethod {
    public static void main(String[] args) {
        // .toString() = Method inherited from the object class.
        //              Used to return a string representation of an object 
        //              By default, it returns a hush code as a unique
        //              It can overridden to provide meaningful details.

        Car car = new Car("fond", "raptor", 2026, "white", 100000);
        System.out.println(car);

    }
}
