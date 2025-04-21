package Interview_Questions;

public class reverse_Array {
    public static void main(String[] args) {
         String input = "India is Great";

         String[] words = input.split(" ");
        for (int i = words.length - 1 ; i >= 0 ; i--) {
            System.out.print(words[i]);
            if ( i != 0){
                System.out.printf(" ");
            }
        }
    }
}
