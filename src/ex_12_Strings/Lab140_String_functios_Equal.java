package ex_12_Strings;

public class Lab140_String_functios_Equal {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1 == str2);// check the location reference
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3)); //checks the value

    }
}
