package ex_07_Switch;

import java.util.Scanner;

public class Lab085_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = scanner.nextInt();
        switch (a){
            case 1:
                System.out.println("MOn");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("W");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("fr");
                break;
            case 6:
                System.out.println("Sat");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
