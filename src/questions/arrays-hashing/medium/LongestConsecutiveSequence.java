package questions.arrays.hashing.medium;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <div><p>Given an unsorted array of integers <code>nums</code>, return <em>the length of the longest consecutive elements sequence.</em></p>
 *
 * <p>You must write an algorithm that runs in&nbsp;<code>O(n)</code>&nbsp;time.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 *
 * <pre><strong>Input:</strong> nums = [100,4,200,1,3,2]
 * <strong>Output:</strong> 4
 * <strong>Explanation:</strong> The longest consecutive elements sequence is <code>[1, 2, 3, 4]</code>. Therefore its length is 4.
 * </pre>
 *
 * <p><strong>Example 2:</strong></p>
 *
 * <pre><strong>Input:</strong> nums = [0,3,7,2,5,8,4,6,0,1]
 * <strong>Output:</strong> 9
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * 	<li><code>0 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 * 	<li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
 * </ul>
 * </div>
 */
public class LongestConsecutiveSequence {

    private LongestConsecutiveSequence(){}
    public static int longestConsecutive(int[] nums) {
        List<Integer> listNums = Arrays.stream(nums).boxed().collect(Collectors.toList());
        if(listNums.isEmpty()) return 0;
        Collections.sort(listNums);
        int answer = 0;
        int count = 0;
        for(int i = 0 ; i<nums.length-1; i++){
            if(!Objects.equals(listNums.get(i + 1), listNums.get(i))) {
                if (listNums.get(i + 1) - listNums.get(i) == 1) {
                    count++;
                } else {
                    if (count > answer) {
                        answer = count;
                    }
                    count = 0;
                }
            }
        }
        if(count>answer) answer=count;
        return answer+1;
    }
}
