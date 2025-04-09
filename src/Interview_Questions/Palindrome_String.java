package Interview_Questions;

import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String num = sc.next();
        String org_num = num;
         String rev = "";

         int len = num.length();
        for(int i = len-1; i >=0 ; i--) {
            rev = rev + num.charAt(i);
        }
            if (org_num.equals(rev)){
                System.out.println("Palindrome");
            }
            else {
                System.out.println("NOt palindrome");
            }


        }

    }

