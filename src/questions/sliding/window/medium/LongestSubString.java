package questions.sliding.window.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * <div><p>Given a string <code>s</code>, find the length of the <strong>longest substring</strong> without repeating characters.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 *
 * <pre><strong>Input:</strong> s = "abcabcbb"
 * <strong>Output:</strong> 3
 * <strong>Explanation:</strong> The answer is "abc", with the length of 3.
 * </pre>
 *
 * <p><strong>Example 2:</strong></p>
 *
 * <pre><strong>Input:</strong> s = "bbbbb"
 * <strong>Output:</strong> 1
 * <strong>Explanation:</strong> The answer is "b", with the length of 1.
 * </pre>
 *
 * <p><strong>Example 3:</strong></p>
 *
 * <pre><strong>Input:</strong> s = "pwwkew"
 * <strong>Output:</strong> 3
 * <strong>Explanation:</strong> The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * 	<li><code>0 &lt;= s.length &lt;= 5 * 10<sup>4</sup></code></li>
 * 	<li><code>s</code> consists of English letters, digits, symbols and spaces.</li>
 * </ul>
 * </div>
 */
public class LongestSubString {
    public static int lengthOfLongestSubstring(String s) {
        List<Character> tempSubString = new ArrayList<>();
        int maxLength = 0;
        int len = 0;
        for(int i = 0; i< s.length(); i++){
            if(!tempSubString.contains(s.charAt(i))){
                tempSubString.add(s.charAt(i));
                len++;
            } else {
                maxLength = Math.max(maxLength, len);
                int indexOfDupe = tempSubString.indexOf(s.charAt(i));
                tempSubString= tempSubString.subList(indexOfDupe+1, tempSubString.size());
                tempSubString.add(s.charAt(i));
                len=tempSubString.size();
            }
        }
        return Math.max(maxLength, len);
    }
}
