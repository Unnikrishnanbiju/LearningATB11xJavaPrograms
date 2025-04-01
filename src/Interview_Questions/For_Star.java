package Interview_Questions;

import java.util.Scanner;

public class For_Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the star amount");
        int star = sc.nextInt();
        for (int i = 1; i <=star ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
