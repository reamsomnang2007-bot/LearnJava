import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int num;
        num = random.nextInt(1, 11);
        System.out.println(num);
    }
}
