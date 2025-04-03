package Interview_Questions;

public class Vowels {
    public static void main(String[] args) {
        public int[] countVowelsCons(String str) {
            int vCount = 0;
            int cCount = 0;

            for(int i=0; i<str.length(); i++) {
                char ch = str.charAt(i);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vCount++;
                } else if((ch >= 'a' && ch <= 'z') {
                    cCount++;
                }
            }

            return new int[]{vCount, cCount};
        }
    }
}
