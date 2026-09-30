public class methods {
    public static void main(String[] args) {
        String first = "Ream";
        String last = "Somnang";
        int age = 17;
        double result = square(3.5);
        System.out.println(result);
        System.out.println(cube(5.5));
        System.out.println(getFullName(first, last));
        if(ageCheck(age)){
            System.out.println("Login successful!");
        }
        else{
            System.out.println("Your age is not enough to Login!");
        }
    }
    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you");
        System.out.printf("Happy Birthday dear %s\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you\n");
    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
    static String getFullName(String first, String last){
        return first + " " + last;
    }
    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
}
