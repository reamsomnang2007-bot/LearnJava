public class breakContinue {
    public static void main(String[] args) {
        // break = break out of a loop (stop)
        // continue = skip current iteration of a loop (skip)

        for (int i = 0; i < 10; i++) {
            if(i == 5){
                break;
            }
            if(i == 2){
                continue;
            }
            System.out.println(i + " ");
        }
    }
}
