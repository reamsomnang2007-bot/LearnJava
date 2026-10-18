public class Abstraction {
    public static void main(String[] args){
        // abstract = Used to define abstract classes and methods.
        //            Abstraction is the process of hiding implementation details
        //            and showing only the essential features;
        //            Abstract classes Can't be instaniated directly
        //            Can contain 'abstract' methods (which must be implemented)
        //            Can contain 'concrete' methods (which are inherited)
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3, 4);
        Rectangle rectangle = new Rectangle(6, 7);
        circle.display();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}
