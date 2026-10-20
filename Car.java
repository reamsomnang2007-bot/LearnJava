public class Car{
    private String make;
    private String model;
    private int year;
    private String color;
    private int price;


    Car(String make, String model, int year, String color, int price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }
    void show(){
        System.out.println(this.make + " " + this.model + " " +this.year + " " +this.color);
    }

    // get method
    String getMake(){
        return this.make;
    }
    String getModel(){
        return this.model;
    }
    int getYear(){
        return this.year;
    }
    String getColor(){
        return this.color;
    }
    // set method
    void setColor(String color){
        this.color = color;
    }
    void setPrice(int price){
        if(price < 0){
            System.out.println("Price can't be less than zero");
        }
        else{
            this.price = price;
        }
    }
    
}
