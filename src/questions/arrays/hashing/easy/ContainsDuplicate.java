package questions.arrays.hashing.easy;

import java.util.HashSet;
import java.util.Set;

/**
 *<div data-key="description-content" data-cy="description-content" class="tab-pane__ncJk css-1eusa4c-TabContent e5i1odf5">
 *    <div class="description__24sA">
 *       <div class="content__u3I1 question-content__JfgR">
 *          <div>
 *             <p>Given an integer array <code>nums</code>, return <code>true</code> if any value appears <strong>at least twice</strong> in the array, and return <code>false</code> if every element is distinct.</p>
 *             <p>&nbsp;</p>
 *             <p><strong>Example 1:</strong></p>
 *             <pre><strong>Input:</strong> nums = [1,2,3,1]
 * <strong>Output:</strong> true
 * </pre>
 *             <p><strong>Example 2:</strong></p>
 *             <pre><strong>Input:</strong> nums = [1,2,3,4]
 * <strong>Output:</strong> false
 * </pre>
 *             <p><strong>Example 3:</strong></p>
 *             <pre><strong>Input:</strong> nums = [1,1,1,3,3,4,3,2,4,2]
 * <strong>Output:</strong> true
 * </pre>
 *             <p>&nbsp;</p>
 *             <p><strong>Constraints:</strong></p>
 *             <ul>
 *                <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 *                <li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
 *             </ul>
 *          </div>
 *       </div>
 *    </div>
 * </div>
 */
public class ContainsDuplicate {
    private ContainsDuplicate() {}

    public static boolean containsDuplicate(int[] nums) {
        int i = 0;
        Set<Integer> hashSet = new HashSet<>();

        for(i=0;i<nums.length;i++){
            if(!hashSet.contains(nums[i])){
                hashSet.add(nums[i]);
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicate2(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            if (!hashSet.add(num)) return false;
        }
        return true;
    }
}
