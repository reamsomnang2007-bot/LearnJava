import java.util.Scanner;
public class mathCalculate {
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
        int a;
        int b;
        int c;
        double x1;
        double x2;
        double delta;
        System.out.println("------------------------------------------");
        System.out.println("----------( Quadratic Equation )----------");
        System.out.println("------------------------------------------");
        System.out.println("-----{ Equations form }-----");
        System.out.println("Ax² + Bx + C = 0");
        System.out.println("----------------------------");
        System.out.println("-----{ Please assign the value below }-----");
        System.out.println("-------------------------------------------");

        System.out.print("Value A : ");
        a = scanner.nextInt();

        System.out.print("Value B : ");
        b = scanner.nextInt();

        System.out.print("Value C : ");
        c = scanner.nextInt();

        System.out.println("-------------------------------------------");
        System.out.println("-----{ Equations form }-----");
        System.out.printf("(%d)x² + (%d)x + (%d) = 0\n",a , b, c);
        delta = (Math.pow(b, 2) - 4 * a * c);
        if(delta > 0){
            System.out.println("---> delta = b² -4ac");
            System.out.println("delta > 0");
            System.out.println("-----{ Answer }-----");
            x1 = (-b + Math.pow(delta, 0.5)) / 2*a;
            x2 = (-b - Math.pow(delta, 0.5)) / 2*a;
            System.out.printf("---> x1 = %.2f\n", x1);
            System.out.printf("---> x2 = %.2f\n", x2);
            System.out.println("--------------------");
        }
        else if(delta == 0){
            System.out.println("---> delta = b² -4ac");
            System.out.println("delta = 0");
            System.out.println("-----{ Answer }-----");
            x1 = x2 = -b / 2*a;
            System.out.printf("---> x1 = x2 = %.2f\n", x1);
            System.out.println("--------------------");
        }
        else{
            System.out.println("---> delta = b² -4ac");
            System.out.println("delta < 0");
            System.out.println("No solution!. Zero real solutions!");
        }
        }
    }
}
