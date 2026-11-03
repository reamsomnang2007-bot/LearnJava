public class anonymousClasses {
    public static void main(String[] args){

        // anonymous class = A class that doesn't have a name. Cannot be resued
        //                   Add custom behavior without having to create a new class.
        //                   Often used for one time uses (TimerTask, Runnable, callbacks)

        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){
            @Override
            void speak(){
                System.out.println("Scooby Doo say Ruh Roh");
            }
        };

        dog1.speak();
        dog2.speak();

    }
}
