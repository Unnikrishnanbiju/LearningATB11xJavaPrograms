package Interview_Questions;

public class CountNumber {
    public static void main(String[] args) {
//        int num = 123456;
//        int count = 0;
//         while(num>0){
//             num = num/10;
//             count++;
//         }
//        System.out.println(count);
         String str = "Welcome to Java";
         String rev ="";
         int len = str.length();

         for (int i = len-1; i >=0;i--){
             rev = rev + str.charAt(i);
         }
        System.out.println(rev);

    }
}
