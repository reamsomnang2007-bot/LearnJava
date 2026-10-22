import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class arraylists {
    public static void main(String[] args){

        //  ArrayList = a resizeble array that stores objects (autoboxing).
        //             Arrays are fixed in size, but ArrayList can change.

        ArrayList<Integer> id = new ArrayList<>();

        id.add(3);
        id.add(1);
        id.add(8);

        ArrayList<Double> price = new ArrayList<>();

        price.add(3.14);
        price.add(9.99);
        price.add(5.77);
        price.add(8.99);

        ArrayList<String> names = new ArrayList<>();

        names.add("Ream Ra");
        names.add("Hour Nareth");
        names.add("Ream Somnang");
        names.add("Ream Kosin");
        names.add("Ream Chansola");

        ArrayList<Character> symbols = new ArrayList<>();

        symbols.add('!');
        symbols.add('@');
        symbols.add('#');
        symbols.add('$');
        symbols.add('%');
        symbols.add('^');
        symbols.add('&');

        // remove methods
        symbols.remove(6);

        // set methods replace value
        symbols.set(1, 'R');

        // get method 
        System.out.println(symbols.get(3));

        // step to sort 
        Collections.sort(names);


        for(char symbol : symbols){
            System.out.println(symbol);
        }
        Scanner input = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();
        System.out.print("Enter the # of food would you like : ");
        int numOfFood = input.nextInt();
        input.nextLine();
        for(int i = 1; i <= numOfFood; i++){
            System.out.print("Enter food #" + i + " : ");
            String food = input.nextLine();
            foods.add(food);
        }

        System.out.println(foods);


        input.close();




    }
}
