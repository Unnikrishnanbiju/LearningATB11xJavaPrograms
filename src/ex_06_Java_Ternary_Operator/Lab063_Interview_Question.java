package ex_06_Java_Ternary_Operator;

import java.util.Scanner;

public class Lab063_Interview_Question {
    public static void main(String[] args) {
        //Nested ternary
        Scanner scanner = new Scanner(System.in);


      int num = scanner.nextInt();
      String result = (num > 10) ? "A" : (num > 20 ? "N>20" : "N<20");
        System.out.println(result);
    }
}
