package Interview_Questions;

import java.util.Scanner;

public class swapping_two_number {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the numebrs");
    int a = sc.nextInt();
    int b = sc.nextInt();
int c = 0;
c = a;
a = b;
b= c;

//        a = a+b;
//        b= a-b;
//        a = a-b;

        System.out.println(a);
        System.out.println(b);
    }
}
