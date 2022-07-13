package questions.arrays.hashing.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <div data-key="description-content" data-cy="description-content" class="tab-pane__ncJk css-1eusa4c-TabContent e5i1odf5">
 *    <div class="description__24sA">
 *       <div class="content__u3I1 question-content__JfgR">
 *          <div>
 *             <p>Given two strings <code>s</code> and <code>t</code>, return <code>true</code> <em>if</em> <code>t</code> <em>is an anagram of</em> <code>s</code><em>, and</em> <code>false</code> <em>otherwise</em>.</p>
 *             <p>An <strong>Anagram</strong> is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.</p>
 *             <p>&nbsp;</p>
 *             <p><strong>Example 1:</strong></p>
 *             <pre><strong>Input:</strong> s = "anagram", t = "nagaram"
 * <strong>Output:</strong> true
 * </pre>
 *             <p><strong>Example 2:</strong></p>
 *             <pre><strong>Input:</strong> s = "rat", t = "car"
 * <strong>Output:</strong> false
 * </pre>
 *             <p>&nbsp;</p>
 *             <p><strong>Constraints:</strong></p>
 *             <ul>
 *                <li><code>1 &lt;= s.length, t.length &lt;= 5 * 10<sup>4</sup></code></li>
 *                <li><code>s</code> and <code>t</code> consist of lowercase English letters.</li>
 *             </ul>
 *             <p>&nbsp;</p>
 *             <p><strong>Follow up:</strong> What if the inputs contain Unicode characters? How would you adapt your solution to such a case?</p>
 *          </div>
 *       </div>
 *    </div>
 * </div>
 */
public class IsAnagram {
    private IsAnagram() {}

    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        char[] schar = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(schar[i])){
                map.put(schar[i], map.get(schar[i])+1);
            } else {
                map.put(schar[i], 1);
            }
        }
        char[] tchar = t.toCharArray();
        for(int i=0; i<t.length(); i++){
            if(map.containsKey(tchar[i])){
                if(map.get(tchar[i]) == 0){
                    return false;
                }
                map.put(tchar[i], map.get(tchar[i])-1);
            } else {
                return false;
            }
        }
        List<Integer> list = new ArrayList<>(map.values());
        list.removeIf(integer -> integer == 0);
        return list.isEmpty();
    }
}
