package questions.oneDP;

/**
 * <div class="_1l1MA" data-track-load="qd_description_content"><p>Given a string <code>s</code>, return <em>the longest</em> <span data-keyword="palindromic-string" class=" cursor-pointer relative text-dark-blue-s text-sm"><div class="popover-wrapper inline-block" data-headlessui-state=""><div><div id="headlessui-popover-button-:rg1:" aria-expanded="false" data-headlessui-state=""><em>palindromic</em></div></div></div></span> <span data-keyword="substring-nonempty" class=" cursor-pointer relative text-dark-blue-s text-sm"><div class="popover-wrapper inline-block" data-headlessui-state=""><div><div id="headlessui-popover-button-:rg4:" aria-expanded="false" data-headlessui-state=""><em>substring</em></div></div></div></span> in <code>s</code>.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong class="example">Example 1:</strong></p>
 *
 * <pre><strong>Input:</strong> s = "babad"
 * <strong>Output:</strong> "bab"
 * <strong>Explanation:</strong> "aba" is also a valid answer.
 * </pre>
 *
 * <p><strong class="example">Example 2:</strong></p>
 *
 * <pre><strong>Input:</strong> s = "cbbd"
 * <strong>Output:</strong> "bb"
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;= s.length &lt;= 1000</code></li>
 * 	<li><code>s</code> consist of only digits and English letters.</li>
 * </ul>
 * </div>
 */
public class LongestPalindrome {

    static int maxLen = 0;
    static String ans = "";
    public static String longestPalindrome(String s) {
        if(s.length()<2){
            return s;
        }
        maxLen = 0;
        ans = "";
        for(int i = 0; i < s.length(); i++){
            generateOdd(i, s);
            if(i< s.length()-1) generateEven(i, s);
        }
        return ans;
    }

    public static void generateOdd(int i, String s){
        String build = String.valueOf(s.charAt(i));
        for(int j = 0; j<=i && i+j<s.length(); j++){
            build = s.substring(i-j, i+j+1);
            if(s.charAt(i-j) != s.charAt(i+j)) {
                maxLen = Math.max(maxLen, (j-1)*2 +1);
                if (ans.length() < maxLen) ans = s.substring(i-j, i+j+1);
                return;
            }
        }
        maxLen = Math.max(maxLen, build.length());
        if (ans.length() < maxLen) ans = build;
    }

    public static void generateEven(int i, String s){
        if(s.charAt(i) == s.charAt(i+1)) {
            String build = String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i+1));
            for (int j = 0; j <= i && i + 1 + j < s.length(); j++) {
                build = s.substring(i - j, i + 1 + j + 1);
                if (s.charAt(i - j) != s.charAt(i + 1 + j)) {
                    maxLen = Math.max(maxLen, (j + 1) * 2);
                    if (ans.length() < maxLen) ans = s.substring(i - j, i + 1 + j + 1);
                    return;
                }
            }
            maxLen = Math.max(maxLen, build.length());
            if (ans.length() < maxLen) ans = build;
        }
    }

    public static void main (String[] args){
        System.out.println(longestPalindrome("cccc"));
    }
}
