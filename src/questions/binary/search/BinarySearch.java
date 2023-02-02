package questions.binary.search;

/**
 * <div class="flex h-full w-full flex-1 flex-col"><p>Given an array of integers <code>nums</code> which is sorted in ascending order, and an integer <code>target</code>, write a function to search <code>target</code> in <code>nums</code>. If <code>target</code> exists, then return its index. Otherwise, return <code>-1</code>.</p>
 *
 * <p>You must write an algorithm with <code>O(log n)</code> runtime complexity.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong class="example">Example 1:</strong></p>
 *
 * <pre><strong>Input:</strong> nums = [-1,0,3,5,9,12], target = 9
 * <strong>Output:</strong> 4
 * <strong>Explanation:</strong> 9 exists in nums and its index is 4
 * </pre>
 *
 * <p><strong class="example">Example 2:</strong></p>
 *
 * <pre><strong>Input:</strong> nums = [-1,0,3,5,9,12], target = 2
 * <strong>Output:</strong> -1
 * <strong>Explanation:</strong> 2 does not exist in nums so return -1
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;

        while(low<=high){
            int mid=(low+(high-low)/2);
            if(nums[mid]==target) return mid;
            if(nums[mid]<target) {
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}
