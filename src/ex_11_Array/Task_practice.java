package ex_11_Array;

public class Task_practice {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 45, 22};

        System.out.println(giv_me_max(array));
    }
    public static int giv_me_max(int [] array){
        int max = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > max){
                max = array[i];

            }}
        return max;
        }

    }

