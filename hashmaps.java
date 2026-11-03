import java.util.HashMap;

public class hashmaps {
    public static void main(String[] args){


        HashMap<String, Double> fruits = new HashMap<>();
        fruits.put("apple", 0.50);
        fruits.put("banana", 0.25);
        fruits.put("orange", 0.50);
        fruits.put("coconut", 1.00);

        // fruits.remove("banana");
        // System.out.println(fruits.get("apple"));
        // System.out.println(fruits.containsKey("pineapple"));
        System.out.println(fruits.size());

        for(String key : fruits.keySet()){
            System.out.println(key + " : $" + fruits.get(key));
        }

    }
}
