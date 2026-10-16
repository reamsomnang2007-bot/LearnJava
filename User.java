public class User {
    String username;
    String email;
    int age;

    User(){
        this.username = "Ream Somnang";
        this.email = "reamsomnang2007@gmail.com";
        this.age = 19;
    }
    User(String username){
        this.username = username;
        this.email = "not provided";
        this.age = 0;
    }
    User(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }
    User(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }
    void display(){
        System.out.println("Username : " + username);
        System.out.println("Email : " + email);
        System.out.println("Age : " + age);
    }
}
