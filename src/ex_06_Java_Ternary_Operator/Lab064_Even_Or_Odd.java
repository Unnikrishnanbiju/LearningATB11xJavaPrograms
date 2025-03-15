package ex_06_Java_Ternary_Operator;

import java.util.Scanner;

public class Lab064_Even_Or_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt() ;
        String result = (num%2 == 0) ? "Even": "Odd";

        System.out.println(result);
    }
}
