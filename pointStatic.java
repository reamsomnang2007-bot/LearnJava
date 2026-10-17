public class pointStatic {
    public static void main(String[] args) {
        // static = makes a variable or method belong to the class
        //          rather than to any specific object
        //          commonly used for utility methods or shared resources
        Friend friend1 = new Friend("John");
        Friend friend2 = new Friend("Jane");
        Friend friend3 = new Friend("Mike");

        System.out.println(friend1.name);
        System.out.println(friend2.name);
        System.out.println(friend3.name);
        
        Friend.showFriends();
    }
}
