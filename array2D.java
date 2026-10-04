public class array2D {
    public static void main(String[] args){
        // 2D array = an array where each element is an array 
        // useful for storing a matarix of data
        // String[][] groceries = {
        //     {"apple", "banana", "orange"},
        //     {"meat", "fish", "chicken"},
        //     {"potato", "onion", "carrot"}
        // };
        // groceries[0][2] = "coconut";
        // for(String[] foods : groceries){
        //     for(String food : foods){
        //         System.out.print(food + " ");
        //     }
        //     System.out.println();
        // }

        char[][] telephone = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'},
            {'*', '0', '#'}
        };

        for(char[] row : telephone){
            for(char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
