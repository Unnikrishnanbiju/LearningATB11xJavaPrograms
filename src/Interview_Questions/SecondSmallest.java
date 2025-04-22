package Interview_Questions;
import java.util.Arrays;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {5,9,1,3,7};

        Arrays.sort(arr);

        int secondSamllest = arr[1];
        int secondLargest = arr[arr.length -2];

        System.out.println(Arrays.toString(arr));
        System.out.println(secondSamllest);
        System.out.println(secondLargest);


    }
}
