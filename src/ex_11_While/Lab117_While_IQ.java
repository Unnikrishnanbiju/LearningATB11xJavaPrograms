package ex_11_While;

import java.util.Scanner;

public class Lab117_While_IQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = scanner.nextInt();

        int Fac = 1;
        if (number <=0){
            System.out.println(Fac);
        }
        else {
            for (int i =1;i<=number;i++){
Fac = Fac*i;
            }
        }
        System.out.println(Fac+"Factorial ");
}
}