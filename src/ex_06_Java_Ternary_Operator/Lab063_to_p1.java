package ex_06_Java_Ternary_Operator;

import java.util.Scanner;

public class Lab063_to_p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int number = 5;
        int number = scanner.nextInt();

        String result = number > 0 ? "Positive" : "Negative";
        System.out.println(result);

    }
}
