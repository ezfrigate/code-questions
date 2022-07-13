package questions.arrays.hashing.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * <div>
 *    <p>Given an integer array <code>nums</code>, return <em>an array</em> <code>answer</code> <em>such that</em> <code>answer[i]</code> <em>is equal to the product of all the elements of</em> <code>nums</code> <em>except</em> <code>nums[i]</code>.</p>
 *    <p>The product of any prefix or suffix of <code>nums</code> is <strong>guaranteed</strong> to fit in a <strong>32-bit</strong> integer.</p>
 *    <p>You must write an algorithm that runs in&nbsp;<code>O(n)</code>&nbsp;time and without using the division operation.</p>
 *    <p>&nbsp;</p>
 *    <p><strong>Example 1:</strong></p>
 *    <pre><strong>Input:</strong> nums = [1,2,3,4]
 * <strong>Output:</strong> [24,12,8,6]
 * </pre>
 *    <p><strong>Example 2:</strong></p>
 *    <pre><strong>Input:</strong> nums = [-1,1,0,-3,3]
 * <strong>Output:</strong> [0,0,9,0,0]
 * </pre>
 *    <p>&nbsp;</p>
 *    <p><strong>Constraints:</strong></p>
 *    <ul>
 *       <li><code>2 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 *       <li><code>-30 &lt;= nums[i] &lt;= 30</code></li>
 *       <li>The product of any prefix or suffix of <code>nums</code> is <strong>guaranteed</strong> to fit in a <strong>32-bit</strong> integer.</li>
 *    </ul>
 *    <p>&nbsp;</p>
 *    <p><strong>Follow up:</strong>&nbsp;Can you solve the problem in <code>O(1)&nbsp;</code>extra&nbsp;space complexity? (The output array <strong>does not</strong> count as extra space for space complexity analysis.)</p>
 * </div>
 */
public class ProductOfArrayExceptSelf {
    private ProductOfArrayExceptSelf(){}

    public static int[] productExceptSelf(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int zerocount = 0;
        for(int i = 0; i < nums.length; i++){
            list.add(i,nums[i]);
            if(nums[i] == 0){
                zerocount++;
            }
        }
        int[] answer = new int[nums.length];
        if(zerocount>=2) {
            for(int i = 0; i < nums.length; i++){
                answer[i] = 0;
            }
        } else if (zerocount == 1){
            int multiplication = 1;
            for(int i = 0; i < nums.length; i++){
                if(i != list.indexOf(0)){
                    multiplication = multiplication*list.get(i);
                }
                answer[i] = 0;
            }
            answer[list.indexOf(0)] = multiplication;
        } else {
            int multiplication = 1;
            for(int i = 1; i < nums.length; i++){
                multiplication = multiplication*list.get(i);
                answer[0] = multiplication;
            }
            for(int i = 1; i < nums.length; i++){
                multiplication = multiplication* list.get(i-1)/ list.get(i);
                answer[i] = multiplication;
            }
        }
        return answer;
    }
}
