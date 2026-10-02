import java.util.Arrays;
public class array {
    public static void main(String[] args){
        // array =  a collection of varibles of the same data type
        String[] cars = {"Camaro", "Mustang", "Challenger", "BMW"};
        // int numOfCars = cars.length;
        // for(int i = 0; i < numOfCars; i++){
        //     System.out.print(cars[i] + " ");
        // }
        Arrays.sort(cars);
        Arrays.fill(cars, "BMW M4");
        for(String car : cars){
            System.out.println(car);
        }
    }
}
