package LeetCode_Task;

import java.util.HashMap;

public class TwoSum_Problem {

        public static int[] twoSumHash(int[] num,int target){
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < num.length; i++) {
                int complement = target - num[i];
                if (map.containsKey(complement)){
                    return new int[]{map.get(complement),i };
                }
                map.put(num[i], i);

            }
            return new int[]{};



        }
    public static void main(String[] args) {
        // Example array and target
        int[] numbers = {2, 5, 11, 15};
        int target = 9;

        // Call the twoSumHash method and get the result
        int[] result = twoSumHash(numbers, target);

        // Check if result is valid
        if (result.length == 2) {
            System.out.println("Indices of the two numbers that add up to " + target + " are: "
                    + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two numbers add up to the target.");
        }
    }

}
