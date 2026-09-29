public class ternaryOperator {
    public static void main(String[] args){
        // ternary operator = Return 1 of 2 value if a condition is true
        // variable = (condition) ? ifTrue = ifFalse

        int score = 70;
        int number = 2;
        int hours = 17;
        int income = 40000;
        String passOrFail = (score >= 60) ? "Pass" : "Fail";
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";
        double taxRate = (income >= 40000) ? 0.25 : 0.10;
        System.out.println(passOrFail);
        System.out.println(evenOrOdd);
        System.out.println(timeOfDay);
        System.out.println(taxRate);
    }
}
