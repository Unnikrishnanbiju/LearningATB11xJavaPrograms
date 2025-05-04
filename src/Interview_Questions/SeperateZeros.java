package Interview_Questions;

public class SeperateZeros {
    public static void main(String[] args) {
        int[] arr = {1,5,0,6,0,2,0,3,9};
        moveZeroToRight(arr);
        for (int num : arr){
            System.out.println(num + " ");

        }
    }

    public static void moveZeroToRight(int[] arr){
        int index = 0;
        for (int num : arr){
            if (num!= 0){
                arr[index++]= num;
            }
        }
        while (index<arr.length){
            arr[index++]=0;
        }
    }

}
