public class arraysOfObject {
    public static void main(String[] args) {
        Car[] cars = {new Car("mustang", "white"),
                    new Car("covette", "red"),
                    new Car("bugati", "black"),
                    new Car("BMW", "mansory color")
        };
        for(Car car : cars){
            car.drive();
        }
    }
}
