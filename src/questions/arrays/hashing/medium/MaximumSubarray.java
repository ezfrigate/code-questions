package questions.arrays.hashing.medium;

/**
 * <a href="https://leetcode.com/problems/maximum-subarray/">GO TO QUESTION</a>
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maximumSum = Integer.MIN_VALUE, currSumSubarray = 0;
        for (int i = 0; i < nums.length; i++) {
            currSumSubarray += nums[i];
            maximumSum = Math.max(maximumSum, currSumSubarray);
            currSumSubarray = Math.max(currSumSubarray, 0);
        }
        return maximumSum;
    }
}
