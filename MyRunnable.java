public class MyRunnable implements Runnable{

    // threading

//    @Override
//    public void run(){
//        for(int i = 1; i <= 5; i++){
//            try{
//                Thread.sleep(1000);
//            }
//            catch(InterruptedException e){
//                System.out.println("Thread was Interrupted!");
//            }
//            if(i == 5){
//                System.out.println("Time up!");
//                System.exit(0);
//            }
//        }
//    }
    private String text;
    MyRunnable(String text){
        this.text = text;
    }
    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            try{
                Thread.sleep(1000);
                System.out.println(text);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted!");
            }

        }
    }
}
