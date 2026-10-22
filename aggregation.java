public class aggregation {
    public static void main(String[] args){
        // aggregation = represents "has-a" relationship between objects.
        //               one object contains another object as part of its structure,
        //               but the contained object/s can exits independently

        Book book1 = new Book("The rule of 80/20", 398);
        Book book2 = new Book("The happy prince", 60);
        Book book3 = new Book("The oak tree", 100);

        Book[] books = {book1, book2, book3};

        Library library = new Library("The Library of Kingdom", 1975, books);
        library.displayInfo();

    }
}
