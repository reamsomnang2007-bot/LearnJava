public class composition {
    public static void main(String[] args){
        CarEngine car = new CarEngine("Ferrari", 2025, "V8");
        car.display();
        car.start();
    }
}
