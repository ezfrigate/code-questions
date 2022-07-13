package questions.arrays.hashing.medium;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <div>
 *    <p>Given an integer array <code>nums</code> and an integer <code>k</code>, return <em>the</em> <code>k</code> <em>most frequent elements</em>. You may return the answer in <strong>any order</strong>.</p>
 *    <p>&nbsp;</p>
 *    <p><strong>Example 1:</strong></p>
 *    <pre><strong>Input:</strong> nums = [1,1,1,2,2,3], k = 2
 * <strong>Output:</strong> [1,2]
 * </pre>
 *    <p><strong>Example 2:</strong></p>
 *    <pre><strong>Input:</strong> nums = [1], k = 1
 * <strong>Output:</strong> [1]
 * </pre>
 *    <p>&nbsp;</p>
 *    <p><strong>Constraints:</strong></p>
 *    <ul>
 *       <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 *       <li><code>k</code> is in the range <code>[1, the number of unique elements in the array]</code>.</li>
 *       <li>It is <strong>guaranteed</strong> that the answer is <strong>unique</strong>.</li>
 *    </ul>
 *    <p>&nbsp;</p>
 *    <p><strong>Follow up:</strong> Your algorithm's time complexity must be better than <code>O(n log n)</code>, where n is the array's size.</p>
 * </div>
 */
public class TopKFrequentElements {
    private TopKFrequentElements(){}

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            } else {
                map.put(num, 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
        Collections.reverse(list);
        int[] answer = new int[k];
        for(int i = 0; i<k; i++){
            answer[i] = list.get(i).getKey();
        }
        return answer;
    }
}
