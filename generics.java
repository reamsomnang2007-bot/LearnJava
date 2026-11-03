import java.util.ArrayList;

public class generics {
    public static void main(String[] args){

        // Generics = A concept where you can write a class, interface, or method
        //            that is compatible with different data type.
        //            <T> type parameter (placeholder that gets replaced with a real type)
        //            <String> type argument (specifies the type)

        ArrayList<Student> students = new ArrayList<>();
        Box<String> box = new Box<>();
        Box<Integer> thing = new Box<>();
        Thing<Double> things = new Thing<>();
        Product<String, Double> product = new Product<>("CocaCola", 1.25);
        Product<String, Integer> product1 = new Product<>("ticket", 15);
        Student student = new Student("Ream Somnang", 1, 'M', 19, "Java Course", "A220", "0987654321");

        students.add(student);
        box.setItem("spoon");
        System.out.println(box.getItem());

        thing.setItem(5);
        System.out.println(thing.getItem());

        things.add(1.99);
        double isStatus = things.show();
        System.out.println(isStatus);

        System.out.println(product.getItem());
        System.out.println(product.getPrice());
        product.getPrice();
        product.display();
        product1.display();

        for(Student student1 : students){
            student1.displayAllStudent();
        }
    }
}
