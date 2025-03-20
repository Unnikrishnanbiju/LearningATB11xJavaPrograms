package Interview_Questions;

import java.util.Scanner;

public class Reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");

        String str = sc.nextLine();
        String rever = "";
        int leg = str.length();
        for (int i = leg -1; i >=0 ; i--) {
            rever = rever + str.charAt(i);
        }
        System.out.println(rever);
    }
}
