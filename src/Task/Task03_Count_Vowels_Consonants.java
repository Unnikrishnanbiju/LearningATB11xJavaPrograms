package Task;

import java.util.Scanner;

public class Task03_Count_Vowels_Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String str = sc.next();
        int vol = 0, con = 0;
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch =='i' || ch=='o' || ch=='u' )
                vol++;
            else
                con++;

            }
        System.out.println("Vowels->"+vol+ " "+ "Consonants->"+ con);

        }
    }

