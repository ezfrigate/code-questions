package questions.arrays.hashing.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <div>
 *    <p>Given an array of strings <code>strs</code>, group <strong>the anagrams</strong> together. You can return the answer in <strong>any order</strong>.</p>
 *    <p>An <strong>Anagram</strong> is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.</p>
 *    <p>&nbsp;</p>
 *    <p><strong>Example 1:</strong></p>
 *    <pre><strong>Input:</strong> strs = ["eat","tea","tan","ate","nat","bat"]
 * <strong>Output:</strong> [["bat"],["nat","tan"],["ate","eat","tea"]]
 * </pre>
 *    <p><strong>Example 2:</strong></p>
 *    <pre><strong>Input:</strong> strs = [""]
 * <strong>Output:</strong> [[""]]
 * </pre>
 *    <p><strong>Example 3:</strong></p>
 *    <pre><strong>Input:</strong> strs = ["a"]
 * <strong>Output:</strong> [["a"]]
 * </pre>
 *    <p>&nbsp;</p>
 *    <p><strong>Constraints:</strong></p>
 *    <ul>
 *       <li><code>1 &lt;= strs.length &lt;= 10<sup>4</sup></code></li>
 *       <li><code>0 &lt;= strs[i].length &lt;= 100</code></li>
 *       <li><code>strs[i]</code> consists of lowercase English letters.</li>
 *    </ul>
 * </div>
 */
public class GroupAnagrams {
    private GroupAnagrams(){}
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Character>,List<String>> listMap = new HashMap<>();
        for (String str : strs) {
            List<Character> characterList = str.chars().mapToObj(c -> (char) c).sorted().collect(Collectors.toList());
            if (listMap.containsKey(characterList)) {
                listMap.get(characterList).add(str);
            } else {
                List<String> s = new ArrayList<>();
                s.add(str);
                listMap.put(characterList, s);
            }
        }
        return new ArrayList<>(listMap.values());
    }
}
