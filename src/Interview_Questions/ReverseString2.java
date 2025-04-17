package Interview_Questions;

public class ReverseString2 {
    public static void main(String[] args) {
        String input = "Hello, World";

        String [] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words){
            StringBuilder reversedWord = new StringBuilder(word);
            result.append(reversedWord.reverse().toString()).append(" ");

        }
        System.out.println(result);
    }
}
