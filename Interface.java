public class Interface {
    public static void main(String[] args){
        // Interface = a blueprint for a class that specifies a set of abstract methods
        //             that implementing classes MUST define
        //             supports multiple inheritance-like behavior
        Hawk hawk = new Hawk();
        Fish fish = new Fish();
        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
}
