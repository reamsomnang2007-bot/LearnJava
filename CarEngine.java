public class CarEngine {
    
    String model;
    int year;
    Engine engine;

    CarEngine(String model, int year, String engineType){
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }
    void display(){
        System.out.println("Model : " + this.model);
        System.out.println("Year : " + this.year);
        System.out.println("Engine : " + this.engine.type);
    }
    void start(){
        this.engine.start();
        System.out.println("The " + this.model + " is running!");
    }
}
