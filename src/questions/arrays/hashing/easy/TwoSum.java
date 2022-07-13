package questions.arrays.hashing.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * <div>
 *    <p>Given an array of integers <code>nums</code>&nbsp;and an integer <code>target</code>, return <em>indices of the two numbers such that they add up to <code>target</code></em>.</p>
 *    <p>You may assume that each input would have <strong><em>exactly</em> one solution</strong>, and you may not use the <em>same</em> element twice.</p>
 *    <p>You can return the answer in any order.</p>
 *    <p>&nbsp;</p>
 *    <p><strong>Example 1:</strong></p>
 *    <pre><strong>Input:</strong> nums = [2,7,11,15], target = 9
 * <strong>Output:</strong> [0,1]
 * <strong>Explanation:</strong> Because nums[0] + nums[1] == 9, we return [0, 1].
 * </pre>
 *    <p><strong>Example 2:</strong></p>
 *    <pre><strong>Input:</strong> nums = [3,2,4], target = 6
 * <strong>Output:</strong> [1,2]
 * </pre>
 *    <p><strong>Example 3:</strong></p>
 *    <pre><strong>Input:</strong> nums = [3,3], target = 6
 * <strong>Output:</strong> [0,1]
 * </pre>
 *    <p>&nbsp;</p>
 *    <p><strong>Constraints:</strong></p>
 *    <ul>
 *       <li><code>2 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
 *       <li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
 *       <li><code>-10<sup>9</sup> &lt;= target &lt;= 10<sup>9</sup></code></li>
 *       <li><strong>Only one valid answer exists.</strong></li>
 *    </ul>
 *    <p>&nbsp;</p>
 *    <strong>Follow-up:&nbsp;</strong>Can you come up with an algorithm that is less than&nbsp;<code>O(n<sup>2</sup>)&nbsp;</code>time complexity?
 * </div>
 */
public class TwoSum {

    private TwoSum() {}

    public static int[] twoSum(int[] nums, int target) {
        List<Integer> integers = new ArrayList<>();
        for(int num : nums){
            integers.add(num);
        }
        for(int i=0; i<nums.length; i++){
            if(integers.contains(target-nums[i])){
                if(i!=integers.indexOf(target-nums[i])) {
                    return new int[]{i, integers.indexOf(target - nums[i])};
                }
            }
        }
        return new int[0];
    }
}
