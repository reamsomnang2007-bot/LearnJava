import java.util.Scanner;
public class calculaterProgram {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            double number1;
            double number2;
            char operator;
            double result = 0;
            boolean vaildOperation = true;
            System.out.println("----------{ Calculater Program }----------");
            System.out.print("Enter the first number : ");
            number1 = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /, ^) : ");
            operator = scanner.next().charAt(0);

            System.out.print("Enter the second number : ");
            number2 = scanner.nextDouble();

            switch(operator){
                case '+' -> result = number1 + number2;
                case '-' -> result = number1 - number2;
                case '*' -> result = number1 * number2;
                case '/' -> {
                    if(number2 == 0){
                        System.out.println("Cannot divide by zero!");
                        vaildOperation = false;
                    }
                    else{
                        result = number1 / number2;
                    }
                }
                case '^' -> result = Math.pow(number1, number2);
                default -> {
                    System.out.println("Invalid operator. Pleases enter (+, -, *, /, ^)!");
                    vaildOperation = false;
            }
        }
        if(vaildOperation){
                System.out.printf("Result : %.2f %c %.2f = %.2f", number1, operator, number2, result);
            }
    }
}
}
