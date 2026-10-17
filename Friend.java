public class Friend {
    static int numOfFriends;
    String name;
    Friend(String name){
        this.name = name;
        numOfFriends++;
    }
    void friendName(){
        System.out.println("Your friend name " + name);
    }
    static void showFriends(){
        System.out.println("You have " + numOfFriends + " total friends.");
    }

}
