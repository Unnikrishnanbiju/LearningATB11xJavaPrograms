package ex_06_Java_Ternary_Operator;

import java.util.Scanner;

public class Assignment_grad {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your score ");
        int score = scanner.nextInt();

        String Grade = (score > 90) && (score <=100) ? "A" : score >= 80 ? "B" : (score > 70 )? "C" : (score > 60)? "D" : "F";

        System.out.println(Grade);
    }
}
