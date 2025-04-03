package ex_13_Construtors;

public class ex_18_OOPs_Constructor {

    public static void main(String[] args) {
        Baby b1 = new Baby(); // ✅ Now works fine
        new Baby();
        b1.cry();
    }

    static class Baby { // ✅ Making it static

        String name;

        void cry() {
            System.out.println("Cry!!");
        }

        void sleep() {
            System.out.println("Sleep!!");
        }

        void eat() {
            System.out.println("Eat!!");
        }

        Baby() {
            System.out.println("I'm a default constructor");
        }
    }
}
