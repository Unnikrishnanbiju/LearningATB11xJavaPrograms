package Interview_Questions;

import java.util.Scanner;

public class MAxOfTwoNUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number");
        int n2 = sc.nextInt();

        if (n1 > n2){
            System.out.println(n1+"first number is greater");
        } else if (n2 > n1) {
            System.out.println(n2+"second number is greater");

        }
        else {
            System.out.println("both number are equal");
        }
    }
}
