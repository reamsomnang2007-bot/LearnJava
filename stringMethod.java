public class stringMethod {
    public static void main(String[] args) {
        String name = "Ream Somnang";
        String firstName = "ream";
        String lastName = "somnang";
        int lenght = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf(" ");
        int lastIndex = name.lastIndexOf("o");
        firstName = firstName.toUpperCase();
        lastName = lastName.toLowerCase();
        name = name.trim();
        name = name.replace("o", "a");

        System.out.println(lenght);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.printf("The full name is %s %s", firstName, lastName);
        System.out.println(name);

        if(name.isEmpty()){
            System.out.println("The name cannot be empty!");
        }
        else{
            System.out.printf("Hello, %s\n", name);
        }

        if(name.contains(" ")){
            System.out.println("Your name contains a space!");
        }
        else{
            System.out.println("Your name doesn't contain any space!");
        }

        String password = "password";
        if(password.equalsIgnoreCase("password")){
            System.out.println("The name cannot password");
        }
        else{
            System.out.printf("Hello, %s", password);
        }

    }
}
