public class gettersAndsetters {
    public static void main(String[] args){
        // They help protect object data and add rules for accessing or modifying them
        // GETTERS = Methods that make a field READABLE (read)
        // SETTERS = Methods that make a field WRITEABLE (write)

        Car car = new Car("BMW", "M4", 2026, "Black", 100);

        car.setColor("Red");
        car.setColor("White");
        car.setPrice(-1);
        car.show();
    }
}
