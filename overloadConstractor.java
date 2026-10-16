public class overloadConstractor {
    public static void main(String[] args) {
        // overloaded constructors = allow a class to have multiple constructors
        //                          with difference parameter lists
        //                          enable objects to be initialized in various ways                      
        User user1 = new User();
        User user2 = new User("Ream Kosin");
        User user3 = new User("Ream Ra", "reamra1975@gmail.com");
        User user4 = new User("Hou Nareth", "hounareth@gamil.com", 41);
        
        user1.display();
        user2.display();
        user3.display();
        user4.display();
    }
}
