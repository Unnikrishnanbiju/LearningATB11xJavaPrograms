package Interview_Questions;

import java.util.Scanner;

public class PositiveOrNehativeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check");
        int n = sc.nextInt();
        if (n > 0 ){
            System.out.println("POsitive");
        } else if (n < 0) {
            System.out.println("Negative");

        }else {
            System.out.println("Zero");
        }
    }
}
