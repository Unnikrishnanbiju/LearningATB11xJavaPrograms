package Task;

import java.util.Scanner;

public class Task04_Palindrome_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to check palindrome or not ?");
        String str = sc.next();
        String str_rev = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            str_rev = str_rev + str.charAt(i);
        }
        System.out.println(str_rev);
        if (str.equals(str_rev)) {

            System.out.println("It is palindrome");
        }

            else{
                System.out.println("Its not palindrome");
            }


    }
}
