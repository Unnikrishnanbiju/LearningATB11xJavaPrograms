package ex_06_Java_Ternary_Operator;

import java.util.Scanner;

public class Lab067_To_Three_Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

//        String Max = (a > b) ? "A is bigger " : (c > b)? "C is bigger ":"B";
        int num = (a > b) ? (a > c) ? a : c : ((b > c) ? b : c);
//        System.out.println(Max);
        System.out.println( "Maximum number is "+num);
    }
}
