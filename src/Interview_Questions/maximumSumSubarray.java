package Interview_Questions;

public class maximumSumSubarray {
    public static int maxSubArray(int[] nums){
        int maxSoFar = nums[0], currentMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,-5,4};
        System.out.println("MAximum subarray sum is " + maxSubArray(arr));
    }
}
