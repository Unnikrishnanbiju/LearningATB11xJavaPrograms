package ex_06_Java_Ternary_Operator;

import java.util.Scanner;

public class Lab063_Age_Classification {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        String AgeC = age< 18 ?  "Minor" : ((age > 18)? "Adult" : "Senior citizen");
        System.out.println(AgeC);
    }
}
