package java_one;
import java.util.Arrays;
import java.util.HashMap;

/* 
Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.
You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
Return the answer with the smaller index first.
Example:
Input: 
nums = [3, 4, 5, 6]     target = 7

Output: 
[0,1]        
 */

public class TwoSums {

    public static void main(String[] argv){

        int[] nums = {3, 4, 5, 6};
        int target = 9;
        int[] result = twoSums(nums, target);

        System.out.println(Arrays.toString(result));

    }

    // O(n)... can be faster
    // public static int[] twoSum(int[] nums, int target){

    //     for (int i = 0; i < nums.length; i++){
    //         for (int j = 0; j < nums.length; j++)
    //             if (nums[i] + nums[j] == target) {
    //                 return new int[] {i, j};
    //             }
    //     }

    //     return nums;
    // }
    
    // O(nlogn)... much quicker approach
    public static int[] twoSums(int[] nums, int target){

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer complement = map.get(nums[i]);
            if (complement != null) {
                return new int[] {complement, i};
            }
            map.put(target - nums[i], i);
        }

        return nums;
    }
}
