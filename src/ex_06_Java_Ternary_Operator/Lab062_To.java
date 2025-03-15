package ex_06_Java_Ternary_Operator;

public class Lab062_To {
    public static void main(String[] args) {

        int age = 10;
        String canVote = age >= 18 ? "Yes, You can vote" : "No, you cant vote ";

        System.out.println(canVote);
    }
}
